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
    <img src="https://github.com/user-attachments/assets/64767f44-d5f1-4dba-98f6-c2c3600b065f" alt="현장 견학 1" style="width: 48%; height: auto; border-radius: 8px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);">
    <img src="https://github.com/user-attachments/assets/49f30b4c-6217-41a0-b955-4c7909e559a8" alt="현장 견학 2" style="width: 48%; height: auto; border-radius: 8px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);">
</div>

---

## 2. 시스템 아키텍처 (System Architecture)

### 모듈별 핵심 기능
![image](https://github.com/user-attachments/assets/d44e1f69-022a-4bca-8b73-d9d7c1291104)

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

### 멀티테넌트 아키텍처와 데이터 관리
### EKS 기반 인프라 자동화
### 보안 및 운영 자동화
### 분산 시스템 및 데이터 처리 최적화
### 성능 최적화 및 모니터링 구축
### MSA 서비스 분할 및 성능 부하테스트

## 6. 결론 및 개선방안 (Conclusions & Recommendations)

### 프로젝트 결과 요약 - 주요 성과 지표(KPI)
![image](https://github.com/user-attachments/assets/6430a128-349e-486b-96dd-39d946d3a572)

| ![image](https://github.com/user-attachments/assets/b1416730-d17b-492b-8508-7b216e385d75) | ![image](https://github.com/user-attachments/assets/10ac63ab-a9d2-45e2-89fc-38667e68729d) |
| --- | --- |
| ![image](https://github.com/user-attachments/assets/a215526d-152a-40e8-860e-09dbc32a7448) | ![image](https://github.com/user-attachments/assets/71c5f4c2-5f0a-49ad-8e06-363f5010c85b) |

![image](https://github.com/user-attachments/assets/58055108-b47e-46b7-b4fb-7315eb86f144)



