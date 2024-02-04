public class DQ_0130 {
    public static void main(String args[]) {
        // for문을 이용해서 a배열의 값을 b배열로 복사해보세요.
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int tmp;
                tmp=a[i][j];
                b[i][j]=tmp;
                //이런 코드를 원한걸까?
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
                System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
            }
        }


        /////////////////////////////Q2
        System.out.println("\nQ2");
        int[] arr = {12,4,7,20,1};
        int max = 0;
        float avg,sum = 0;
        for(int i=0;i<5;i++){
            sum+=arr[i];
            if(max<arr[i]) max = arr[i];
        }
        avg = sum/5;
        //아마 sum은
        System.out.println(max);
        System.out.println(avg);


        ////////////////Q3///////////////////////////////
        System.out.println("\nQ3");
        for(int i=1;i<=20;i++){
            if(i%2==0) System.out.print(i+" ");
        }

        ///////////////////////Q4//////////////////////
        System.out.println("\nQ4");
        for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.print(i + "*"+j+"=" + i*j +" ");
            }
            System.out.print("\n");
        }

        int coffee = 10;
        int money = 300;
        while(money>0){
            System.out.println("give me money");
            coffee--;
            money-=30;
            System.out.println("coffee : " + coffee);
            if(coffee==0 || money ==0){
                System.out.println("sold out!");
                break;
            }
        }
        int num = 0;
        while (num<10){
            num++;
            if(num%2==1)System.out.println(num);
        }
    }
}
