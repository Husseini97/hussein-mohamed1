# LoginTests - Test Cases

## Test Case 1: Valid Login
**Test Description**: Verify that a valid user can successfully log in to the application.  
**Test Steps**:  
1. Enter valid username (`standard_user`).
2. Enter valid password (`secret_sauce`).
3. Click the login button.
4. Verify that the user is navigated to the inventory page (`https://www.saucedemo.com/inventory.html`).

**Expected Result**:  
User is successfully logged in and redirected to the inventory page.

---

## Test Case 2: Invalid Login
**Test Description**: Verify that entering an incorrect password results in an error message.  
**Test Steps**:  
1. Enter valid username (`standard_user`).
2. Enter an invalid password (`wrong_password`).
3. Click the login button.
4. Verify that the error message is displayed: `Epic sadface: Username and password do not match any user in this service`.

**Expected Result**:  
An error message should be displayed indicating invalid credentials.

---

## Test Case 3: Blank Username
**Test Description**: Verify that attempting to log in without entering a username results in an error message.  
**Test Steps**:  
1. Leave the username field blank.
2. Enter a valid password (`secret_sauce`).
3. Click the login button.
4. Verify that the error message is displayed: `Epic sadface: Username is required`.

**Expected Result**:  
An error message should be displayed indicating that the username is required.

---

## Test Case 4: Blank Password
**Test Description**: Verify that attempting to log in without entering a password results in an error message.  
**Test Steps**:  
1. Enter a valid username (`standard_user`).
2. Leave the password field blank.
3. Click the login button.
4. Verify that the error message is displayed: `Epic sadface: Password is required`.

**Expected Result**:  
An error message should be displayed indicating that the password is required.

---

## Test Case 5: Locked Out User
**Test Description**: Verify that a locked-out user cannot log in and receives an appropriate error message.  
**Test Steps**:  
1. Enter username (`locked_out_user`).
2. Enter password (`secret_sauce`).
3. Click the login button.
4. Verify that the error message is displayed: `Epic sadface: Sorry, this user has been locked out.`

**Expected Result**:  
An error message should be displayed indicating that the user is locked out.

---

## Test Case 6: Problem User (Visual Problem Check)
**Test Description**: Verify that the problematic user's image is loaded correctly after logging in.  
**Test Steps**:  
1. Enter username (`problem_user`).
2. Enter password (`secret_sauce`).
3. Click the login button.
4. Verify that the user is navigated to the inventory page (`https://www.saucedemo.com/inventory.html`).
5. Verify that the problematic image (`https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg`) is loaded successfully by checking the status code.

**Expected Result**:  
The user is navigated to the inventory page and the image is loaded successfully (status code 200).

---

## Test Case 7: Error User (Image Loading Check)
**Test Description**: Verify that the error user's image is loaded correctly after logging in.  
**Test Steps**:  
1. Enter username (`error_user`).
2. Enter password (`secret_sauce`).
3. Click the login button.
4. Verify that the user is navigated to the inventory page (`https://www.saucedemo.com/inventory.html`).
5. Verify that the image (`https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg`) is loaded successfully by checking the status code.

**Expected Result**:  
The user is navigated to the inventory page and the image is loaded successfully (status code 200).

---

## Test Case 8: Performance Glitch User
**Test Description**: Verify that the `performance_glitch_user` logs in and the page loads within an acceptable time frame (3 seconds).  
**Test Steps**:  
1. Enter username (`performance_glitch_user`).
2. Enter password (`secret_sauce`).
3. Click the login button.
4. Measure the time taken for the page to load.
5. Verify that the page loads within 3 seconds.

**Expected Result**:  
The page should load within 3 seconds.

---

