# Any.do Android App Test Plan

## Test Plan
- **App Name**: Any.do
- **Platform**: Android
- **Objective**: Ensure that all major features of the Any.do mobile app work as expected.

Note : the test cases are arranged with their priorites affecting the business.
## Test Cases

### 1. User Signup (New Account Creation)
- **Description**: Verify that a user can successfully sign up for an account using a valid email and password.
- **Preconditions**: None.
- **Steps**:
  1. Open the Any.do app.
  2. Tap on “Sign Up.”
  3. Enter a valid email and password.
  4. Click "Create Account."
- **Expected Result**: The user account is created successfully, and the user is navigated to the app’s main screen.

---

### 2. User Login
- **Description**: Verify that an existing user can successfully log in using their email and password.
- **Preconditions**: The user account should already exist.
- **Steps**:
  1. Open the Any.do app.
  2. Tap on “Log In.”
  3. Enter valid credentials (email and password).
  4. Tap “Log In.”
- **Expected Result**: The user is logged in successfully and redirected to their task list.

---

### 3. Create a New Task
- **Description**: Verify that a user can successfully create a new task.
- **Preconditions**: The user is logged in.
- **Steps**:
  1. Tap on the "Add Task" button.
  2. Enter a task title.
  3. Optionally add a description, due date, and reminder.
  4. Tap "Save."
- **Expected Result**: The new task is created and appears in the task list.

---
### 4. Create a New List
- **Description**: Verify that a user can successfully create a new List.
- **Preconditions**: The user is logged in.
- **Steps**:
  1. Tap on the "Add list" button.
  2. Enter a List title.
  3. Tap the gocery List toggle.
  4. Tap "Save."
- **Expected Result**: The new task is created and appears in the task list.

---

### 5. Edit an Existing Task
- **Description**: Verify that a user can edit an existing task’s details.
- **Preconditions**: The user is logged in and has an existing task.
- **Steps**:
  1. Select an existing task from the task list.
  2. Edit the task title, due date, and reminder.
  3. Save the changes.
- **Expected Result**: The task details are updated successfully and displayed correctly in the task list.

---
### 5. Edit an Existing List
- **Description**: Verify that a user can edit an existing list.
- **Preconditions**: The user is logged in.
- **Steps**:
  1. Select an existing list from the task list.
  2. Edit the task title, due date, and reminder.
  3. Save the changes.
- **Expected Result**: The task details are updated successfully and displayed correctly in the task list.

---

### 6. Complete a Task
- **Description**: Verify that a user can mark a task as completed.
- **Preconditions**: The user is logged in and has an active task.
- **Steps**:
  1. Open the task list.
  2. Select a task and mark it as completed (by tapping the checkbox).
- **Expected Result**: The task is marked as completed and moves to the "Completed Tasks" section.

---

### 7. Try the features in under the hamburger button on the top right of the screen
- **Description**: Verify that a user can (sort, filter , clear .import)
- **Preconditions**: The user is logged in and is currently in a list.
- **Steps**:
  1. Open the task list.
  2. tap the hamburger button on the top right of the screen
- **Expected Result**: The features are working as expected.
  
---

### 8. Create a private list and then add members and lastly change it into public.
- **Description**: private list 
- **Preconditions**: The user is logged in.
- **Steps**:
  1. Open the task list.
  2. tap the plus button and create a list then edit it to be private 
- **Expected Result**: The list is create and access is revoked to external members until it is public.
  
---

### 9. Delete a Task
- **Description**: Verify that a user can successfully delete a task.
- **Preconditions**: The user is logged in and has an active task.
- **Steps**:
  1. Open the task list.
  2. Select a task and tap the delete button.
  3. Confirm the deletion.
- **Expected Result**: The task is deleted and removed from the task list.

---

### 10. Set a Task Reminder
- **Description**: Verify that a user can set a reminder for a task and receive a notification.
- **Preconditions**: The user is logged in and has a task.
- **Steps**:
  1. Open the task creation or editing screen.
  2. Set a reminder for the task.
  3. Wait until the reminder time is reached.
- **Expected Result**: The user receives a push notification at the set reminder time.

---

### 11. Sync Tasks Across Devices
- **Description**: Verify that tasks created or edited on one device are synchronized with another device (or the web version).
- **Preconditions**: The user is logged in on multiple devices or the web version.
- **Steps**:
  1. Log in on the Android device and create a task.
  2. Open Any.do on another device or on the web.
  3. Verify the task is synchronized across both platforms.
- **Expected Result**: The task is successfully synced across all devices.

---

### 12. Use the App in Offline Mode
- **Description**: Verify that the user can create and manage tasks while offline, and the tasks sync when the app is back online.
- **Preconditions**: The user is logged in.
- **Steps**:
  1. Turn off the internet connection on the device.
  2. Create a new task or edit an existing task.
  3. Turn the internet connection back on.
  4. Verify that the tasks are synced.
- **Expected Result**: Tasks created or edited offline are synced once the device goes online.


---

### 13. View Task History (Completed Tasks)
- **Description**: Verify that the user can view completed tasks in the "Completed" section.
- **Preconditions**: The user is logged in and has completed tasks.
- **Steps**:
  1. Open the app.
  2. Navigate to the "Completed" tasks section.
  3. Verify that the completed tasks are listed.
- **Expected Result**: The completed tasks are displayed in the "Completed" tasks section.

---
### 14. Create a Task via Notification
- **Description**: Verify that a user can create a new task using the notification action without opening the app.
- **Preconditions**: The user is logged in and notifications are enabled for the app.
- **Steps**:
  1. Trigger a notification from the app .
  2. From the notification bar, tap the action to "Add Task" without opening the app.
  3. Enter the task details (title, reminder, etc.) in the notification’s input field.
  4. Confirm the task creation action from the notification.
- **Expected Result**: The new task is created successfully and appears in the task list without needing to open the app.

  ---
### 15. Mark the task as done  via Notification
- **Description**: Verify that a user can mark a the task using the notification action without opening the app.
- **Preconditions**: The user is logged in and notifications are enabled for the app.
- **Steps**:
  1. Trigger a notification from the app .
  2. From the notification bar, tap the action to "Done" without opening the app.
  3. Confirm the task creation action from the notification.
- **Expected Result**: The task status is changed.
 
---
### 16. Deep Linking via Notification
- **Description**: Verify that tapping on a specific notification deep link opens the app and navigates to the correct screen (task or reminder screen).
- **Preconditions**: The user is logged in, and a task reminder notification has been triggered.
- **Steps**:
  1. Set a reminder for a task.
  2. When the reminder notification is triggered, tap on the notification.
  3. The app should open and navigate directly to the task details screen.
- **Expected Result**: The app opens and navigates to the task associated with the notification, displaying the task details.

---

### 17. Change the settings of the application
- **Description**: change the theme, prefered screen and the toggle that removes the completed tasks
- **Preconditions**: The user is logged in.
- **Steps**:
  1. Tap settings.
  2. Change widget that shows completed tasks to be OFF 
  3. Change the prefered home screen to calendar 
  4. Change the prefered app color theme


- **Expected Result**: The app changes the settings to be as selected .

---

  
