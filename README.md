# 프로젝트명 : 404WeFound
***
## 1. 개요

### 무엇을 만드나요?

저희는 개발 과정에서 여러 어려움을 겪게 되는 개발자와 학생들을 위해,
질문과 답변을 공유하고 토론할 수 있는 지식 공유 플랫폼을 만들고자 합니다.
이런 플랫폼을 통해 문제 해결 시간을 단축하고 효율성을 높일 수 있습니다.
또한 개발자와 학생들의 경험과 지식을 공유함으로써 개발 역량을 향상시킬 수 있으며,
협력적인 개발 문화를 조성하여, 개발자와 학생들 간의 네트워크를 강화할 수 있습니다.

### 왜 "404WeFound" 인가요?

‘404WeFound’는 흔히 볼 수 있는 404 Not Found에서 가운데 Not만 We로 바꾸어서 지었습니다.
***
## 2. 개발 목표 및 내용

### 2.1 시스템 구성

- 웹 기반 플랫폼으로 개발
- Data Flow Software Architectures 첨부 예정

### 2.2 프로젝트 설정

- 운영체제: Windows 10, macOS
- 개발 언어: Java, JavaScript, HTML, CSS
- 프론트엔드: HTML, CSS, JavaScript
- 백엔드: Spring, Spring Data JPA
- 데이터베이스: H2, Mysql
- 배포환경: AWS EC2, RDS
- 협업도구: Git, GitHub, Notion, erdcloud

### 2.3 개발 범위

- 회원 관리 기능 (회원가입, 아이디/비밀번호 찾기, 프로필 조회, 내 정보 페이지, 계정 삭제)
- 게시판 기능 (질문 작성, 답변 작성, 댓글 조회/생성/삭제/수정, 게시글 정렬, 필터링, 검색)
- 친구 관리 기능 (친구 추가, 1대1 채팅)
- 등급 및 점수 시스템 (답변 채택 시 점수 부여, 좋아요 받을 시 점수 부여, 등급 부여, 등급순위)
- 즐겨찾기 및 좋아요 기능

### 2.4 개발 시간

- 3/22 ~ 3/26 (기획 및 설계) 프로젝트 주제를 설정하고 주제에 대한 요구사항을 파악하고 ERD설계 및 깃 설정을 진행했습니다.

- 3/27 ~ 4/4 (백엔드 구현) 엔티티, 컨트롤러, 서비스, 레포지토리 파일들을 만들고 ERD 설계대로 필요한 테이블과 구현 코드들을 작성함으로써 프로젝트를 진행했습니다.

- 4/5 ~ 4/6 (프론트엔드 구현) 구현한 벡엔드를 기준으로 프론트엔드를 작성해서 실제 url에서 실행되는 것을 보여줄 수 있습니다.

- 4/7 ~ 4/8 (테스트 및 배포 준비) 완성된 프로젝트를 테스트 함으로써 버그 수정을 진행하고 베포를 준비합니다.

### 2.5 ERD

https://github.com/KSC1019/Javaproject-1/blob/master/src/ch9/project_erd.png


### 2.6 진행 상황

1. 회원가입 & 로그인 (User & Join) (완료)

2. 질문 게시판 (Question) (완료)

3. 답변과 답변에 대한 질문 (Answer & Comment) (완료)

4. 좋아요 & 점수 & 등급 (Like & Point & Rank) (완료)

5. CSS 작성 (완료)

6. 테스트 및 배포 
