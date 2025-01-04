# Think Global, Act Local ERP System

## 1. 프로젝트 개요 (Project Overview)

이 프로젝트는 클라우드 환경에서 확장 가능한 ERP 시스템을 구축하기 위해 세 단계로 진행되었습니다.  
각 단계는 기술적 발전을 바탕으로 점진적으로 확장되었으며, 최종적으로 완성된 ERP 시스템 구축을 목표로 했습니다.

---

### 단계별 프로젝트 진행

![이론과 실습의 병행 학습](https://github.com/user-attachments/assets/d37b27b6-ee40-4978-b8d7-71268bdc8c03)

---

### 단계별 GitHub 저장소
- **Phase 1**:
   - [GitHub Repository - Java Version](https://github.com/wjdn154/ERPSystem-Phase1)
- **Phase 2**:
   - [GitHub Repository - Backend](https://github.com/wjdn154/ERPSystem-Phase2-Backend)
   - [GitHub Repository - Frontend](https://github.com/wjdn154/ERPSystem-Phase2-Frontend)
- **Phase 3**: 
   - [GitHub Repository - Backend Service (Monolithic)](https://github.com/wjdn154/ERPSystem-Phase3-Backend-Monolithic)
   - [GitHub Repository - Backend Service (Common)](https://github.com/wjdn154/ERPSystem-Phase3-Backend-Common)
   - [GitHub Repository - Backend Service (FinanceHR)](https://github.com/wjdn154/ERPSystem-Phase3-Backend-FinanceHR)
   - [GitHub Repository - Backend Service (LogisticsProduction)](https://github.com/wjdn154/ERPSystem-Phase3-Backend-LogisticsProduction)
   - [GitHub Repository - Frontend](https://github.com/wjdn154/ERPSystem-Phase3-Frontend)

### 팀 구성 및 역할 분담
<div style="display: flex; justify-content: center;">
    <img src="https://github.com/user-attachments/assets/874b2ec8-ebae-4542-ac87-a0a59489f1d7" alt="팀 구성 및 역할 분담" style="width: 100%; height: auto; border-radius: 8px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);">
</div>

---

### 문제 해결 사례 - ERP 도입 및 적용 현장 견학

<div style="display: flex; justify-content: space-around; gap: 10px; margin-top: 20px;">
    <img src="https://github.com/user-attachments/assets/fc8eb18a-83cf-464d-b630-e84a7950435f" alt="현장 견학 1" style="width: 48%; height: auto; border-radius: 8px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);">
    <img src="https://github.com/user-attachments/assets/844c774a-6ccc-4ef9-8f8b-82b02122041e" alt="현장 견학 2" style="width: 48%; height: auto; border-radius: 8px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);">
</div>

---

## 2. 시스템 아키텍처 (System Architecture)

### 모듈별 핵심 기능
![image](https://github.com/user-attachments/assets/fef37ab9-c968-4451-9b82-672492d32784)

### 업무 프로세스 흐름도
![image](https://github.com/user-attachments/assets/13ca9653-d059-44ab-a2a5-691eef743145)

### 주요 기능 - 재무회계
| ![image](https://github.com/user-attachments/assets/3152fcd2-5be4-4187-99dc-94d747779346) | ![image](https://github.com/user-attachments/assets/b7b4d6ed-3107-404d-abbd-92469dd1b38f) |
| --- | --- |
| ![image](https://github.com/user-attachments/assets/075a77ac-074c-4e69-8e57-87041c34b07a) | ![image](https://github.com/user-attachments/assets/8d7e6f5c-a3b4-4218-bd96-1f147cc38841) |

### 주요 기능 - 인사관리
| ![image](https://github.com/user-attachments/assets/5c8059a0-a023-44f2-b975-e739fb25eb6f) | ![image](https://github.com/user-attachments/assets/02e5bdc5-d2bc-4654-add5-6dcf2feb0a9d) |
| --- | --- |
| ![image](https://github.com/user-attachments/assets/5a750574-4f6e-4cd2-a550-613eb0cb3620) | ![image](https://github.com/user-attachments/assets/83ff6305-7fc5-4d0c-a87d-313b83c1c587) |

### 주요 기능 - 물류관리
| ![image](https://github.com/user-attachments/assets/3f8fb2a1-13b6-46de-9040-23273829f16d) | ![image](https://github.com/user-attachments/assets/3503067b-52ce-4359-acf9-4f45e6cf61ec) |
| --- | --- |
| ![image](https://github.com/user-attachments/assets/a7330e97-ec00-4c8a-96aa-77a9ac7739a1) | ![image](https://github.com/user-attachments/assets/15fd485f-7135-4496-9217-8fbbe0ff4331) |

### 주요 기능 - 생산관리
| ![image](https://github.com/user-attachments/assets/9d36af78-ddba-4e85-8367-18e34035e1ff) | ![image](https://github.com/user-attachments/assets/ff8e0f85-b436-4dd2-bc7a-6fdeeb6818f2) |
| --- | --- |
| ![image](https://github.com/user-attachments/assets/5a8a0de4-61de-4a9a-b786-cf6324bd4135) | ![image](https://github.com/user-attachments/assets/bde469f2-68f7-42cc-94ad-52e4a5912690) |

## 3. 사용 기술 스택 (Tech Stack)
| ![image](https://github.com/user-attachments/assets/9bd3b14a-9de5-4731-ab76-dbd5a93c35e0) | ![image](https://github.com/user-attachments/assets/a63a35ba-c304-4248-af65-26c17e914376) |
| --- | --- |

## 4. 클라우드 아키텍처 (Cloud Architecture)
![image](https://github.com/user-attachments/assets/4c269471-779a-4ed3-8074-d548f8003913)
- AWS EKS 기반의 클라우드 인프라로 구성.
- CI/CD 파이프라인을 통해 배포 자동화 및 운영 효율성 강화.
- 클라우드 환경에서의 확장성 및 가용성을 확보.

## 5. 주요 과제 (Key challenges)

### 5-1. 멀티테넌트 아키텍처와 데이터 관리
| ![image](https://github.com/user-attachments/assets/86282f71-d6e1-4552-82e8-aa787dc581a8) | ![image](https://github.com/user-attachments/assets/86bf91fc-ef85-47f1-9b07-81e300f6f800) |
| --- | --- |
| ![image](https://github.com/user-attachments/assets/4f770715-4563-4c2a-ba16-a542c9dd0c26) | ![image](https://github.com/user-attachments/assets/9e84951c-5952-489f-ba2b-fb29d3ffe80f) |
| ![image](https://github.com/user-attachments/assets/5564ffcc-5aea-4e4c-85d9-c2bc4d1e1388) | ![image](https://github.com/user-attachments/assets/2821adb3-e57c-4cdd-b5bf-7146187e40a0) |
| ![image](https://github.com/user-attachments/assets/412995f9-34c4-4d39-ab81-969ebd0cc28e) | ![image](https://github.com/user-attachments/assets/95c2ad12-68bf-4a77-8770-a7924a7d053b) |
| ![image](https://github.com/user-attachments/assets/825d1831-4cfa-420c-9113-b415713751e3) | ![image](https://github.com/user-attachments/assets/61e5db6a-5baf-4758-8d21-a3d0b4a6c72d) |
| ![image](https://github.com/user-attachments/assets/b1f18139-3ee2-4f44-b6aa-43f968885f2c) | ![image](https://github.com/user-attachments/assets/9e86876d-17db-47d3-a72c-bfa9daa5a132) |
| ![image](https://github.com/user-attachments/assets/e01a3b56-7477-49c1-ab30-c4ae6541f303)


### 5-2. EKS 기반 인프라 자동화
| ![image](https://github.com/user-attachments/assets/9873e6ee-56ab-4b59-a21b-9c60f2fb0f5b) | ![image](https://github.com/user-attachments/assets/876a4385-d0df-4472-9e9e-0e823fc37eaf) |
| --- | --- |
| ![image](https://github.com/user-attachments/assets/85bf5439-021b-4bf5-9cc9-309ab1a5da92) | ![image](https://github.com/user-attachments/assets/8fe6a92b-6847-405d-8d56-4bc1ec96a82b) |
| ![image](https://github.com/user-attachments/assets/532b24a7-0478-47f4-91da-c5f5da2e1e59) | ![image](https://github.com/user-attachments/assets/c8f68deb-9b81-4411-82aa-db25143c1130) |
| ![image](https://github.com/user-attachments/assets/8be06091-f0a9-4f7e-bfcb-61f31f9eadac) | ![image](https://github.com/user-attachments/assets/172e8729-60b4-4403-87f1-dfc92e087cbc) |
| ![image](https://github.com/user-attachments/assets/b61d056b-30fd-4989-92cd-40a8a0ca50c7) | ![image](https://github.com/user-attachments/assets/044750e0-64ba-44ce-b585-ff005abb9f57) |
| ![image](https://github.com/user-attachments/assets/a6b6a59c-a2e1-4c4b-b6a2-37357f93cdb8) | ![image](https://github.com/user-attachments/assets/654d817a-3fed-40b8-8d63-d3bf4839ee5b) |
| ![image](https://github.com/user-attachments/assets/3685145e-97ed-45d2-883d-54db2d5f9b1a) | ![image](https://github.com/user-attachments/assets/74f38977-d210-40fa-be96-af8c7f2dfcb9) |
| ![image](https://github.com/user-attachments/assets/3ae533fc-3081-4a49-af62-63ad4a42617c) | ![image](https://github.com/user-attachments/assets/c9a9e8c5-21cc-4e2c-96c8-43ec7c1dd175) |
| ![image](https://github.com/user-attachments/assets/6ae4b93b-b073-4e3e-aba8-882b581dc7f4) | ![image](https://github.com/user-attachments/assets/30d864c4-7b2d-4d8b-af86-be3d430f4492) |
### 5-3. 보안 및 운영 자동화
### 5-4. 분산 시스템 및 데이터 처리 최적화
### 5-5. 성능 최적화 및 모니터링 구축
### 5-6. MSA 서비스 분할 및 성능 부하테스트

## 6. 결론 및 개선방안 (Conclusions & Recommendations)

### 프로젝트 결과 요약 - 주요 성과 지표(KPI)
![image](https://github.com/user-attachments/assets/6430a128-349e-486b-96dd-39d946d3a572)

| ![image](https://github.com/user-attachments/assets/b1416730-d17b-492b-8508-7b216e385d75) | ![image](https://github.com/user-attachments/assets/10ac63ab-a9d2-45e2-89fc-38667e68729d) |
| --- | --- |
| ![image](https://github.com/user-attachments/assets/a215526d-152a-40e8-860e-09dbc32a7448) | ![image](https://github.com/user-attachments/assets/71c5f4c2-5f0a-49ad-8e06-363f5010c85b) |

![image](https://github.com/user-attachments/assets/58055108-b47e-46b7-b4fb-7315eb86f144)



