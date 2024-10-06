# Bug Report

### Bug 1: While being in the Offline mode and trying to access the online features a missleading error message appears.
- **Reproducible Steps**:
  1. Open the Any.do app and log in.
  2. Tap the notifications in the left corner.

- **Attachments**: [![image](https://github.com/user-attachments/assets/cf1f7a72-f31c-414b-a140-76f01aabb73c)
]
- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Offline (Airplane Mode)
- **Severity**: High
- **Priority**: Mid
- **Impact**: This negatively affects the UX as the user by mistake is in the offline mode and he is confused as there is no clear error message displayed.

---

### Bug 2: The "play" button that appears after making a voice record is not working 
- **Reproducible Steps**:
  1. Open the Any.do app and log in.
  2. Create a task and scroll down to attachments
  3. Record a voice note and then try to play it 
- **Attachments**: [![image](https://github.com/user-attachments/assets/7ebd0063-c696-4217-b3dd-09b1d640971c)
]
- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Wi-Fi
- **Severity**: Medium
- **Priority**: low
- **Impact**: this button either should be working or removed as it will make the user confused and wondering if the VN is recorded or not 

---

### Bug 3: The back button is not woring while the user is on the subscription screen
- **Reproducible Steps**:
  1. Login to Any.do
  2.Navigate to the lists 
  3. Open a non public list 
  4. tap on the subscription icon on the buttom of the screen
  5. Tap the back button

- **Attachments**: [![image](https://github.com/user-attachments/assets/34a3c486-2fd2-4626-b92a-a596cd87e4c8)
]
- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Wi-Fi, Mobile Data
- **Severity**: Low
- **Priority**: low
- **Impact**: Functionality issue as the native back button should be working with all the screens of the application

---

### Bug 4: Calendar Import Freezes for Users with Many Events
- **Reproducible Steps**:
  1. Open Any.do and log in.
  2. Go to settings and choose to import tasks from the Calendar.
  3. If the calendar has many events (+99), the app freezes.
- **Attachments**: [![image](https://github.com/user-attachments/assets/a53c12d2-aaed-406e-bfac-b6cb1abedeb1)
]
- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Wi-Fi, Mobile Data
- **Severity**: Low
- **Priority**: low
- **Impact**: This case is negative but there should be a limit for adding tasks parallel with the performance of the app to avoid screen freezing.

---

### Bug 5: Creating a task with a huge number of characters automaticaly opens the keypad when the user tap on the task
- **Reproducible Steps**:
  1. Open Any.do and log in.
  2. Create a task with a large number of characters
  3. tap on the task
- **Attachments**: [![image](https://github.com/user-attachments/assets/ac0b3aac-c364-459a-9e8c-0de92da5edfc)
]
- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Wi-Fi, Mobile Data
- **Severity**: Low
- **Priority**: mid
- **Impact**: Users with different languages than english like german and russian will have bad user experience while adding a task with a long name .
---

### Bug 6: setting a reminder for the next day is not working as no reminders notifications were sent
- **Reproducible Steps**:
  1. Open Any.do and log in.
  2. Create a task .
  3. tap on the task and set the reminder to be tomorrow.
- **Attachments**: []
- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Wi-Fi, Mobile Data
- **Severity**: high
- **Priority**: high
- **Impact**: Functional bug which will affect most of the users.
---

### Bug 7: UI bug when adding 2 attachments of type record and an image
- **Reproducible Steps**:
  1. Open Any.do and log in.
  2. Create a task .
  3. edit the task and add attachments
- **Attachments**: [![image](https://github.com/user-attachments/assets/b6b78884-3c82-4b82-a265-c14e18575ed5)
]
- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Wi-Fi, Mobile Data
- **Severity**: low
- **Priority**: low
- **Impact**: simple UI finding
---

### Bug 8: Choosing the option that the finished tasks disappear is not working 
- **Reproducible Steps**:
  1. Open Any.do and log in.
  2. Create a task and mark it as finished .
  3. navigate to the settings and choose the option that the finished tasks will not appear 
- **Attachments**: [![image](https://github.com/user-attachments/assets/814469ef-eb20-4617-8be2-9354dcf3f030)
]
- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Wi-Fi, Mobile Data
- **Severity**: mid
- **Priority**: mid
- **Impact**: users with many tasks in the screen will use this option as the sceen will be crowded with a lot of events so it will negatively affects them
---

### Bug 9: The app cannot fetch the contacts although the permission is given to access contacts
- **Reproducible Steps**:
  1. Open Any.do and log in.
  2. Create list and make it private .
  3. add members and then choose contacts
- **Attachments**: [![image](https://github.com/user-attachments/assets/24303334-0291-4f5b-ba07-4408bf324f8b)
]

- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Wi-Fi, Mobile Data
- **Severity**: mid
- **Priority**: low
- **Impact**: this will impacts the users that are using the private lists but there will be another option to add the contacts manually 
---

### Bug 10: Changing the device date and time earlier made all upcoming events to be overdue
- **Reproducible Steps**:
  1. Open Any.do and log in.
  2. Create task and make it after 5 minutes .
  3. go to settings and change the time and date to be gmt-3
- **Attachments**: [![image](https://github.com/user-attachments/assets/9c9f48c7-0292-4d25-beb2-8af65960166d)
]

- **Affected Devices**: 
  - Samsung Galaxy A24 (Android 14)
- **Network**: Wi-Fi, Mobile Data
- **Severity**: very low
- **Priority**: very low
- **Impact**: this is a negative case but this will also make past events come as upcoming if it is was made for GMT+4,5,6 etc 
