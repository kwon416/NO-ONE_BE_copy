
# NO:ONE by TechConnection
<div align=center>
	<img src="https://capsule-render.vercel.app/api?type=waving&color=auto&height=200&section=header&text=NO:ONE%20Project&fontSize=90" />	
</div>
<div align=center>
	<h3>📚 2023 멋쟁이사자처럼 단국대학교 중앙해커톤 프로젝트 📚</h3><br />
	<h4>아무도(no one) 모르는 신기술 백과사전 NO:ONE <br /> 노(no)인과 하나(one)된 삶을 추구하는 NO:ONE</h4>	<br />
  	<h4>디지털 격차가 극심화 되는 추세인 지금, 노인 분들과 디지털 신기술에 어려움을 겪고 계신 분들을 위한 신기술 교육 컨텐츠 무료 제공 플랫폼 입니다. 
</h4>
  <p>팀원 : 박서영[FE], 장현정[FE], 정준서[BE], 권보궁[BE]</p><br />
	<p>✨ Platforms & Languages ✨</p>

</div>
<div align="center">
	<img src="https://img.shields.io/badge/CloudType-181717?style=flat&logo=GitHub&logoColor=white" />
	<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=JavaScript&logoColor=white" />
	<img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=SpringBoot&logoColor=white" />
	<img src="https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=MySQL&logoColor=white" />
</div>
<br>
<div align=center>
	<p>🛠 Tools 🛠</p>
</div>
<div align=center>
	<img src="https://img.shields.io/badge/SpringBoot-2C2255?style=flat&logo=SpringBoot&logoColor=white" />
	<img src="https://img.shields.io/badge/Redis-000000?style=flat&logo=intellijidea&logoColor=white" />
	<img src="https://img.shields.io/badge/AWS-F8DC75?style=flat&logo=GoogleCloud&logoColor=white" />
	<img src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&logoColor=white" />
	<img src="https://img.shields.io/badge/React-61DAFB?style=flat&logo=React&logoColor=white" />
</div>


## 🦁 <b>배경 및 문제파악</b> 🦁
1. 노년층의 디지털 격차 발생 : 시대의 흐름이 빨라지며 새로운 서비스는 지속적으로 등장하는 반면, 노년층의 디지털 문화 적응도는 점차 하락
2. 디지털 격차를 해소하는 조력자의 부재 : 여러 디지털 교육 봉사 활동이 있음에도 불구하고, 매번 새로운 기술이 나와 봉사 활동을 통한 한계가 있어 격차 해소 불가능
3. 디지털 격차 악화 : 노년들이 소외되는 이 사회의 디지털 격차는 점차 악화될 것이며, 걷잡을 수 없이 커지는 이 격차를 해소하고자 함
4. 개선 방안(NO:ONE으로 해결)
    * 디지털 서비스 활용 교육과 사용하기 편한 환경
    * 서비스 이용 절차 간소화, 메인 서비스 위주의 간결한 UI

<br /><br />
## 🦁 <b>백엔드 소개</b> 🦁<br />
***Spring Boot & AWS 기반 백엔드***
1. **유저 관리**
   1. CRUD
   2. JWT 토큰 기반 인증
   3. 회원 휴대폰 인증 Nurigo 모듈 사용
   4. 마이 페이지에서 회원 정보 조회 및 수정
2. **콘텐츠 관리**
    1. CRUD
    2. 실시간 인기 게시물관리. 최근 조회된 100개의 컨텐츠의 조회수 별 정렬.
   3. 컨텐츠 리스트는 단기 컨텐츠 우선으로 정렬  
   4. 유저ID 또는 검색어로 컨텐츠 검색 가능.
   5. 하나의 컨텐츠의 여러 개의 컨텐츠 페이지를 작성 가능.
   6. 각 컨텐츠 페이지는 이미지와 내용, 태그를 가짐.
   7. 이미지 AWS S3 버킷에 저장.
   8. 콘텐츠 생성, 수정, 삭제 시 프로세스를 트랙잭션 처리해 에러에 대응.
3. **포인트 관리**
   1. CRU
   2. 포인트는 컨텐츠를 작성한 후 어드민 페이지에서 통과 시 유저에게 포인트 지급.
   3. 마이 페이지에서 회원 포인트 조회 가능
   4. 경품 응모 등에 포인트 사용 추가 예정
5. **문의글 관리**
   1. CRUD
   2. 로그인한 유저만 작성, 조회가능
   3. 문의글에 대한 답변은 어드민 페이지에서 작성 가능
6. **어드민 페이지**
   1. Thymeleaf + BootStrap으로 작성.
   2. 모든 유저 & 컨텐츠 조회 가능
   3. 유저 수동 비활성화, 컨텐츠 공개 여부 수정 및 포인트 지급 가능.

<br /><br />
## 🦁 <b>ERD</b> 🦁<br />
![NO_ONE](https://github.com/kwon416/NO-ONE_BE_copy/assets/95855658/923bb5d0-fc21-46e5-b296-15cc7142937d)

<br /><br />
## 🦁 <b>API 명세</b> 🦁<br />
공통 url : /api/v1

|   분류    |    API 명    | METHOD |       PATH       | 접근 권한 |                          비고                          |
|:-------:|:-----------:|:------:|:----------------:|:-----:|:----------------------------------------------------:|
| **유저**  |             |        |    **/user**     |       |                                                      | 
|         |    회원가입     |  POST  |     /signup      |       |                                                      |
|         |     로그인     |  GET   |      /login      |       |                                                      |
|         |   전화번호 인증   |  GET   |      /phone      |       |                                                      |
|         |  회원 정보 수정   |  PUT   |                  |  본인   |                                                      |
|         |    회원 탈퇴    | DELETE |                  |       |                     회원 사용 여부 값 변경                    |
|         |  회원 정보 조회   |  GET   |                  |       |                                                      |
| **콘텐츠** |             |        |   **/content**   |       |                                                      | 
|         |   콘텐츠 등록    |  POST  |                  |  본인   |                  페이지 당 파일 1개 + 설명 1개                 |
|         |   콘텐츠 리스트   |  GET   |                  |       |              단기성 콘텐츠 먼저 띄워주고, 이후 전체 콘텐츠              |
|         |   콘텐츠 디테일   |  GET   |   /{contentId}   |       | 검색 태그 있는 경우, 프론트로 response+ history 테이블에 contentId 추가 |
|         |    검색하기     |  GET   | /search?keyword= |       |         회사명, 제목, 설명에서 일치하는 단어 있으면 response    |
|         | 	실시간 인기 콘텐츠 |  GET   |    /realtime     |       |      최근 쌓인 데이터 or n분 내에 데이터 중에서만 쿼리                                                 |
|         |   콘텐츠 수정    |  POST  |                  |  본인   |                                                      |
|         |   콘텐츠 삭제    | DELETE |                  |       |                                                      |
| **포인트** |             |        |    **/point**    | |                                                      |
|         |  보유 포인트 확인  |  GET   |                  |    본인   |                                                      |
|     |   포인트 적립    |  POST  |      /admin      |    ADMIN   |                                                      |
|     **문의**       |             |        |     /inquiry     |       |                                                      |
|         |   문의글 작성    |  POST  |                  |   |       |
|         |   문의글 디테일   |  GET   |   /{inquiryId}   |   |       |
|         |   문의글 수정    |  PUT   |   /{inquiryId}   |   |       |
|         |   문의글 삭제    | DELETE  |   /{inquiryId}   |   |       |
|         |   문의글 답변    |  POST  |      /admin      |  ADMIN |       |

## 🦁 <b>핵심 기능 소개</b> 🦁<br />
| 메인 페이지  |  컨텐츠 교육 페이지   |  컨텐츠 등록 페이지  |
| :-------------------------------------------: | :------------: | :-----------: |
|  <img width="329" src="https://github.com/LIKELION-DKU-11th/.github/assets/88546743/4d054ad0-3ff2-4485-a626-2d044d474281"/> |  <img width="329" src="https://github.com/LIKELION-DKU-11th/.github/assets/88546743/13a4042c-3166-43bf-812a-e9f91308667e"/> |  <img width="329" src="https://github.com/LIKELION-DKU-11th/.github/assets/88546743/f2805d41-9a13-4580-8117-0658602639e5" />|
| 문의글 페이지   |  마이 페이지   |  로그인 및 회원가입  |
| <img width="329" src="https://github.com/LIKELION-DKU-11th/.github/assets/88546743/ff9e9886-d0dc-48a4-a18e-f335cfd4d409"/>   |  <img width="329" src="https://github.com/LIKELION-DKU-11th/.github/assets/88546743/860c6143-5987-461d-888c-77c2a8a747f2"/>     |  <img width="329" src="https://github.com/LIKELION-DKU-11th/.github/assets/88546743/15ce091d-d256-4e13-8e03-051e2dc3a77a" />|

### ⭐️ 메인페이지
- 디지털 서비스를 이용하다 막혔을 때 이용할 수 있는 검색창(ex. 배달의 민족 어플을 이용하여 배달 주문을 이용하고 싶지만 사용 방법을 모를때) "배달의 민족", "배달 주문 방법", "배민" 등 간단한 검색)
- 실시간 인기 검색 키워드로 최근 유행 컨텐츠 열람 가능, 사용자가 디지털 서비스를 이용하다 가장 많이 도움을 받은 순위를 알 수 있음
- 교육 컨텐츠 모아보기: 전체 교육 컨텐츠, 카테고리별로 한 눈에 모든 컨텐츠를 볼 수 있음
- 상단 광고 배너를 통해 신규 및 인기 컨텐츠 홍보

### ⭐️ 컨텐츠 교육 페이지
- 단기 이벤트의 경우 검색 결과 마감 기한과 함께 상단에 배치
- 단계별 참고 자료와 설명으로 디지털 컨텐츠 교육 제공
- 추가 교육 필요 부분은 컨텐츠 우측 상단에 안내 (ex. 배달의 민족 어플에서 결제 중 카드 등록 방법을 모를 때 "카드 등록" 방법 안내 유도)

### ⭐️ 컨텐츠 등록 페이지
- 회원가입을 한 유저만 정해진 폼에 맞춰 직접 교육 컨텐츠 등록 가능
- 컨텐츠 등록을 하면 포인트 지급 (추후 포인트 사용 가능)

### ⭐️ 문의글 페이지
- 문의글 등록을 통해 유저가 직접 필요한 교육 콘텐츠 요청 가능
- 간편한 UI 제공으로 노년층의 해당 서비스 사용 유도 (원하는 교육 컨텐츠가 없을 때 간편하게 문의 가능. ex) 온라인으로 백신 사전예약 하는 방법을 모르겠어요.)

### ⭐️ 마이페이지 및 로그인/회원가입
- 마이페이지에서 자신이 작성한 컨텐츠, 문의글 열람 가능 (+개인 정보)
- 컨텐츠 등록으로 얻은 포인트 조회 가능
- 포인트 사용을 위해 회원가입에서 핸드폰 번호 인증 수행




## 라이센스
MIT © [Team. TechConnection]
