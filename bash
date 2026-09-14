# Initialize repo
git init

# Add all files
git add .

# First commit
git commit -m "Initial TaskTrack project setup"

# Add remote (replace URL with your GitHub Classroom repo)
git remote add origin https://github.com/CLASSROOM_ORG/TASKTRACK_REPO.git

# Push to main branch
git branch -M main
git push -u origin main
git add .
git commit -m "Week 2: Implement home screen and RecyclerView"
git push
