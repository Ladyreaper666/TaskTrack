# TaskTrack – Android Academic Task Manager

## I. Project Description

### A. Working Title
TaskTrack

### B. Overview
TaskTrack is a mobile application designed to help students organize courses, assignments, due dates, and priorities in one centralized location. Core functionality includes adding assignments, categorizing them by course, tracking completion status, and receiving deadline reminders.

- **Target audience:** High school, college, and adult learners managing multiple classes or training programs  
- **Intended use case:** Daily academic planning, deadline tracking, and workload management  

### C. Project Scope

**High-level features:**
- Course creation and management  
- Assignment entry with due dates and priority levels  
- Notifications for upcoming deadlines  
- Local and cloud data storage  
- User authentication  

**Expected deliverables:**
- Functional Android app prototype  
- Core screens and navigation  
- Local Room database  
- Firebase integration  
- Documentation and GitHub repository  

---

## II. Problem Addressing

### A. Business Problem
Students receive assignment information from multiple sources (LMS, syllabi, lectures, email), making it easy to overlook deadlines. The lack of a centralized academic-specific task manager increases stress, reduces productivity, and leads to missed assignments.

### B. Proposed Solution
TaskTrack consolidates all academic tasks into one structured interface designed specifically for student workflows.

**Expected impact:**
- Improved organization  
- Fewer missed deadlines  
- Better time management  
- Reduced cognitive load  

---

## III. Platform

### A. Development Platform
- Android Studio (Kotlin, native development)  
- Firebase (Firestore + Authentication)  
- Room database  
- GitHub for version control  
- Material Design components (optional but recommended)  

### B. Deployment Platform
- Android 10 (API 29) and above  
- Local APK installation for testing  
- Future deployment to Google Play Store  

---

## IV. Front-End / Back-End Support

### A. Front-End

**UI Components:**
- EditText fields for assignment input  
- RecyclerView for assignment lists  
- Buttons, cards, and Material Design elements  

**Navigation Structure:**
- Bottom navigation bar  
- Activity-to-activity or fragment-based navigation  

**Visual Design Considerations:**
- Clean, student-friendly layout  
- Consistent color palette  
- Accessibility (contrast, readable fonts)  

### B. Back-End

**Database / Cloud Storage:**
- Room database for offline access  
- Firebase Firestore for cloud sync  

**Authentication:**
- Firebase Authentication (email/password or Google sign-in)  

**Optional API Integrations:**
- Calendar sync  
- Notification scheduling  

---

## V. Functionality

### A. Core Features
- Add, edit, and delete assignments  
- Organize tasks by course  
- Mark assignments as complete  
- Receive deadline notifications  
- View upcoming tasks in chronological order  

### B. Secondary Features
- Priority tagging (high/medium/low)  
- Course color-coding  
- Cloud backup and multi-device sync  
- Calendar integration  
- AI-based workload suggestions (future enhancement)  

### C. System Requirements
- Android smartphone  
- Minimum 2GB RAM  
- Internet required for Firebase sync  
- Offline mode supported via Room  

---

## VI. Design (Wireframes)

### A. Home Screen Layout
- Summary of upcoming assignments  
- Quick-add button  
- Course filter options  

### B. Navigation Flow
- Home → Course List → Assignment Details  
- Home → Add Assignment → Save → Return to Home  
- Settings → Account → Sync Options  

### C. Key Feature Screens
- Add Assignment screen  
- Course management screen  
- Assignment detail view  
- Completed tasks archive  

### D. Notes on UI/UX Decisions
- Prioritize simplicity and clarity  
- Reduce cognitive load with minimal clutter  
- Use Material Design guidelines for consistency  
- Ensure intuitive navigation for first-time users  

---

## VII. Week 2 Status

- Project created in Android Studio  
- MainActivity and home screen layout based on wireframe  
- RecyclerView and dummy task data implemented  
- Git repository initialized and pushed to GitHub Classroom  
- README updated to reflect current scope and progress  


