package ch10;

import java.util.Arrays;

/*
해당 코드는 와일드 카드 예제를 확인하면서 공부하는 코드이다.
 */
public class Sample3 {
    public static void registerCourse(Course<?> course) {    //모든 과정
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStd()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {    //학생 과정
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStd()));
    }

    public static void registerCourseWorker(Course<? super Worker> course) {    // 직장인과 일반인 과정
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStd()));
    }
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));


        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);				// 모든 과정 등록 가능
        System.out.println();

        // registerCourseStudent(personCourse);  (X)
        // registerCourseStudent(workerCourse);	 (X)
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);		// 학생 과정만 등록 가능
        System.out.println();

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);				// 직장인과 일반인 과정만 등록 가능
        // registerCourseWorker(studentCourse); 	(X)
        // registerCourseWorker(highStudentCourse); (X)

    }
}
