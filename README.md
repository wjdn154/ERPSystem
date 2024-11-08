# Think Global, Act Local ERP System

## 1. 프로젝트 개요 (Project Overview)

이 프로젝트는 단계별로 진행되며, 학습을 통해 기술 스택을 확장하고 클라우드 환경으로 점진적으로 발전시킴. 각 단계는 기본 기술 이해부터 서비스 분할 아키텍처까지의 과정을 포함함.

### 단계별 프로젝트 학습 목표

1. **1단계: 순수 자바로 기본 시스템 구축**
   - **목표**: 객체지향 프로그래밍 및 기초적인 ERP 시스템 설계 개념을 학습.
   - **주요 학습 포인트**:
     - 순수 자바를 사용하여 기초적인 ERP 기능을 구현함.
     - 데이터 처리 로직 및 객체 간 상호작용을 설계하고 구현하는 과정 학습.
     - 깃허브 주소: [GitHub Repository - Java Version](#)

2. **2단계: Spring Boot와 React로 시스템 리팩토링**
   - **목표**: 프론트엔드와 백엔드의 분리, 스프링 프레임워크와 React를 활용한 웹 애플리케이션 아키텍처 학습.
   - **주요 학습 포인트**:
     - Spring Boot를 사용하여 백엔드를 구축하고, RESTful API 설계 및 구현.
     - React를 통해 프론트엔드와의 연결 및 사용자 인터페이스 개선.
     - 데이터베이스 연동 및 간단한 CRUD 기능을 통한 실습.
     - 깃허브 주소: [GitHub Repository - Spring Boot & React Version](#)

3. **3단계: AWS EKS를 이용한 마이크로서비스 아키텍처 구축**
   - **목표**: AWS EKS와 Kubernetes를 사용하여 서비스를 마이크로서비스로 분할하고, 확장성과 관리 효율성을 높임.
   - **주요 학습 포인트**:
     - Kubernetes 클러스터 설정 및 EKS 배포 과정 이해.
     - 백엔드 서비스를 분할하여 각 서비스가 독립적으로 배포, 확장될 수 있도록 설정.
     - VPC, IAM, 로드 밸런서, CI/CD와 같은 클라우드 컴퓨팅 개념 학습 및 구현.
     - 각 서비스별 GitHub 주소:
       - [GitHub Repository - Service 1](#)
       - [GitHub Repository - Service 2](#)
       - [GitHub Repository - Service 3](#)
       - …

---

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
