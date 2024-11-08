# Think Global, Act Local ERP System

## 1. 프로젝트 개요 (Project Overview)

이 프로젝트는 3단계로 구성된 ERP 시스템 개발을 통해 클라우드 환경에서 확장 가능한 솔루션을 구축한 사례임. 각 단계에서는 프로젝트 목표에 따라 점진적으로 기술을 확장하고, 클라우드 인프라를 활용한 최종 ERP 시스템을 성공적으로 완성하였음.

### 단계별 프로젝트 진행 결과

#### Phase 1: 자바 기반의 기초 ERP 시스템 구축
- **결과**:
  - 자바와 MVC 아키텍처를 사용하여 ERP 시스템의 기본 구조를 구현함.
  - 사원 관리, 사용자 관리, 부서 관리 등 인사관리의 기본 기능과 기초적인 데이터베이스 연동을 성공적으로 수행함.
  - 초기 단계에서 ERP의 필수 기능을 이해하고, 기초 아키텍처에 대한 경험을 쌓음.

- **성과**:
  - 순수 자바와 데이터베이스 설계를 통한 ERP 시스템의 기초 구조 구축 완료.
  - 추후 단계에서 확장 가능한 아키텍처 설계 경험을 바탕으로 다음 단계의 기반을 다짐.

#### Phase 2: Spring Boot와 React를 통한 웹 통합 및 동적 기능 확장
- **결과**:
  - Spring Boot와 React를 사용하여 ERP 시스템의 웹 애플리케이션을 개발함.
  - REST API를 설계하고 사용자 인증, CRUD 기능을 포함한 주요 ERP 기능을 웹 환경으로 확장함.
  - 프론트엔드에서 사용자 경험을 고려하여 UI를 개선하고, ERP 시스템의 사용성을 높임.

- **성과**:
  - React와 Spring Boot를 활용한 웹 통합으로 시스템 사용성이 대폭 향상됨.
  - ERP 기능이 웹 환경에서 원활히 작동하며, 추후 클라우드 환경으로 확장 가능하도록 설계됨.

#### Phase 3: AWS EKS 및 마이크로서비스 아키텍처로 클라우드 기반 ERP 구현
- **결과**:
  - AWS EKS를 사용하여 클라우드 네이티브 환경에 ERP 시스템을 배포함.
  - ERP 시스템을 마이크로서비스로 분할하여, 각 서비스가 독립적으로 배포 및 확장 가능하도록 구축함.
  - CI/CD 파이프라인을 도입하여 배포 자동화와 운영 효율성을 높이고, 실시간 모니터링 및 로깅을 통해 시스템 상태를 실시간으로 관리할 수 있게 함.

- **성과**:
  - 클라우드 환경에서의 확장성 및 가용성을 극대화한 ERP 시스템 완성.
  - 운영 자동화를 통해 관리 비용을 절감하고, 장애 대응 시간을 단축할 수 있는 안정적인 아키텍처 확보.

### 프로젝트 전반 성과 및 학습 효과
- **종합적인 기술 습득**: 자바 기초부터 시작해 Spring Boot, React, AWS EKS 및 Kubernetes를 활용한 마이크로서비스 아키텍처까지 점진적으로 기술을 습득하고 적용함.
- **실무형 클라우드 아키텍처 구축**: EKS와 CI/CD 파이프라인을 도입하여 확장성과 운영 효율성을 고려한 클라우드 솔루션을 구현함으로써, 클라우드 환경에서의 ERP 시스템 운영 역량을 높임.

---

![image](https://github.com/user-attachments/assets/d37b27b6-ee40-4978-b8d7-71268bdc8c03)

---

### 단계별 GitHub 저장소
- **Phase 1**: [GitHub Repository - Java Version](#)
- **Phase 2**: [GitHub Repository - Spring Boot & React Version](#)
- **Phase 3**: 
   - [GitHub Repository - EKS Backend Service 1](#)
   - [GitHub Repository - EKS Backend Service 2](#)
   - [GitHub Repository - EKS Backend Service 3](#)

### 팀 구성 및 역할 분담 (Team Composition and Roles)
<div style="display: flex; justify-content: center;">
    <img src="https://github.com/user-attachments/assets/874b2ec8-ebae-4542-ac87-a0a59489f1d7" alt="팀 구성 및 역할 분담" style="width: 100%; height: auto; border-radius: 8px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);">
</div>

---

### ERP 도입 및 적용 현장 견학 (Field Study for ERP Implementation and Application)

<div style="display: flex; justify-content: space-around; gap: 10px; margin-top: 20px;">
    <img src="https://github.com/user-attachments/assets/64767f44-d5f1-4dba-98f6-c2c3600b065f" alt="현장 견학 1" style="width: 48%; height: auto; border-radius: 8px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);">
    <img src="https://github.com/user-attachments/assets/49f30b4c-6217-41a0-b955-4c7909e559a8" alt="현장 견학 2" style="width: 48%; height: auto; border-radius: 8px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);">
</div>

---

## 2. 주요 기능 (Key Features)

### 재무회계
![image](https://github.com/user-attachments/assets/3152fcd2-5be4-4187-99dc-94d747779346) | ![image](https://github.com/user-attachments/assets/b7b4d6ed-3107-404d-abbd-92469dd1b38f)
---|---|
![image](https://github.com/user-attachments/assets/075a77ac-074c-4e69-8e57-87041c34b07a) | ![image](https://github.com/user-attachments/assets/8d7e6f5c-a3b4-4218-bd96-1f147cc38841)

<hr/>

### 인사관리
![image](https://github.com/user-attachments/assets/5c8059a0-a023-44f2-b975-e739fb25eb6f) | ![image](https://github.com/user-attachments/assets/02e5bdc5-d2bc-4654-add5-6dcf2feb0a9d)
---|---|
![image](https://github.com/user-attachments/assets/5a750574-4f6e-4cd2-a550-613eb0cb3620) | ![image](https://github.com/user-attachments/assets/83ff6305-7fc5-4d0c-a87d-313b83c1c587)

<hr/>

### 물류관리
![image](https://github.com/user-attachments/assets/3f8fb2a1-13b6-46de-9040-23273829f16d) | ![image](https://github.com/user-attachments/assets/3503067b-52ce-4359-acf9-4f45e6cf61ec)
---|---|
![image](https://github.com/user-attachments/assets/a7330e97-ec00-4c8a-96aa-77a9ac7739a1) | ![image](https://github.com/user-attachments/assets/15fd485f-7135-4496-9217-8fbbe0ff4331)

<hr/>

### 생산관리
![image](https://github.com/user-attachments/assets/9d36af78-ddba-4e85-8367-18e34035e1ff) | ![image](https://github.com/user-attachments/assets/ff8e0f85-b436-4dd2-bc7a-6fdeeb6818f2)
---|---|
![image](https://github.com/user-attachments/assets/5a8a0de4-61de-4a9a-b786-cf6324bd4135) | ![image](https://github.com/user-attachments/assets/bde469f2-68f7-42cc-94ad-52e4a5912690)

## 3. 사용 기술 스택 (Tech Stack)
![image](https://github.com/user-attachments/assets/c54cdc7d-ad7c-4814-a08d-5173d7fe46c4) | ![image](https://github.com/user-attachments/assets/ba59e8bd-56d3-49b9-b405-d7f68d6c6cf7)
---|---|

## 4. 클라우드 아키텍처 (Cloud Architecture)
## 5. API 문서 (API Documentation)
## 6. 개발 과정 및 성과 (Development Process & Milestones)
## 7. 트러블슈팅 (Troubleshooting)
