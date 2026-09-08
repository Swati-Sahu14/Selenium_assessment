<div align="center">

# 🧪 Selenium Automation Journey

### Java • Selenium WebDriver • Web Automation • Hands-on Assessments

<p>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white"/>
  <img src="https://img.shields.io/badge/Chrome-4285F4?style=for-the-badge&logo=googlechrome&logoColor=white"/>
  <img src="https://img.shields.io/badge/Automation%20Testing-6C63FF?style=for-the-badge"/>
</p>

<p>
  <a href="https://github.com/Swati-Sahu14">
    <img src="https://img.shields.io/badge/GitHub-Swati--Sahu14-181717?style=flat-square&logo=github&logoColor=white"/>
  </a>
  <a href="https://www.linkedin.com/in/swati-sahu02/">
    <img src="https://img.shields.io/badge/LinkedIn-Connect-0A66C2?style=flat-square&logo=linkedin&logoColor=white"/>
  </a>
</p>

</div>

---

## 🚀 About This Repository

This repository contains my **hands-on Selenium with Java implementations**
completed as part of my **Capgemini Hire, Train & Deploy (HTD) training journey**.

It serves as a personal record of the daily Selenium assessments assigned
during training, along with the practical concepts and automation skills
developed through each exercise.

The assessment requirements are shared by the trainer, while each trainee
maintains an **individual repository** containing their own implementations.

> **Understand → Implement → Execute → Validate → Improve**

---

## 🎓 Capgemini HTD Training

This repository is part of my technical learning journey through the
**Capgemini Hire, Train & Deploy (HTD) model**.

The training follows a structured approach where concepts are introduced
progressively and reinforced through hands-on assessments.

### Current Learning Journey

```text
Manual Testing
      ↓
SQL
      ↓
Core Java
      ↓
Selenium WebDriver
      ↓
Locators & XPath
      ↓
WebElement Methods
      ↓
Synchronization & Waits
      ↓
Dropdowns & Auto-Suggestions
      ↓
Actions Class
      ↓
Screenshots
      ↓
JavaScriptExecutor
      ↓
Iframes & Window Handling
      ↓
Alerts & Popups
      ↓
Advanced Selenium Automation
```

---

# 📚 Selenium Learning Progress

Approximately **120+ pages of the current Selenium training material**
have been covered so far.

The training material covered so far includes Selenium fundamentals,
WebDriver, locators, WebElement methods, synchronization, dropdowns,
auto-suggestions, Actions, screenshots, JavaScriptExecutor, iframes and
popup handling.

---

# 🧠 Topics Covered

## 🌐 Selenium Fundamentals

- Selenium Introduction
- Selenium WebDriver
- Browser Launch
- ChromeDriver
- WebDriver Methods
- Browser Navigation
- Window Management
- Window Handles
- Switching Between Windows

## 🔎 Locators

- ID
- Name
- Class Name
- Tag Name
- Link Text
- Partial Link Text
- CSS Selector
- XPath
- XPath using Attributes
- XPath using Text
- XPath using Surroundings
- XPath Axes
- `findElement()`
- `findElements()`

## 🧩 WebElement Methods

- `click()`
- `submit()`
- `sendKeys()`
- `clear()`
- `getText()`
- `getAttribute()`
- `getTagName()`
- `getCssValue()`
- `getSize()`
- `getLocation()`
- `getRect()`
- `isDisplayed()`
- `isSelected()`
- `isEnabled()`

## ⏱️ Synchronization

- Thread Sleep
- Implicit Wait
- Explicit Wait
- Fluent Wait
- Polling Time
- Expected Conditions
- `WebDriverWait`

## 📋 Dropdown Handling

Using Selenium's `Select` class:

- `selectByIndex()`
- `selectByValue()`
- `selectByVisibleText()`
- `deselectByIndex()`
- `deselectByValue()`
- `deselectByVisibleText()`
- `deselectAll()`
- `getFirstSelectedOption()`
- `getAllSelectedOptions()`
- `isMultiple()`
- `getOptions()`

## 🔍 Auto-Suggestions

- Handling dynamic suggestions
- Using `findElements()`
- Working with lists of WebElements
- Reading suggestion text
- Selecting the required suggestion

## 🖱️ Actions Class

### Mouse Actions

- `moveToElement()`
- `click()`
- `doubleClick()`
- `contextClick()`
- `clickAndHold()`
- `release()`
- `dragAndDrop()`
- `dragAndDropBy()`
- `moveByOffset()`
- `moveToLocation()`

### Keyboard Actions

- `sendKeys()`
- `keyDown()`
- `keyUp()`

### Scrolling

- `scrollByAmount()`
- `scrollToElement()`

## 📸 Screenshots

Practical screenshot handling for:

- Capturing web elements
- Capturing webpage screenshots
- Saving screenshots as execution evidence

## ⚡ JavaScriptExecutor

Practical usage including:

- Window scrolling
- Scrolling to coordinates
- Scrolling elements into view
- Working with disabled elements
- Working with hidden elements

Example:

```java
JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("window.scrollBy(0,500)");
```

## 🖼️ Iframes

Frame handling using:

```java
driver.switchTo().frame();
```

Switching between frames using:

```java
driver.switchTo().frame(int index);

driver.switchTo().frame(String nameOrId);

driver.switchTo().frame(WebElement frameElement);
```

Returning from frames:

```java
driver.switchTo().parentFrame();

driver.switchTo().defaultContent();
```

## 🚨 Popup Handling

The training includes handling different popup scenarios such as:

- JavaScript Alerts
- Confirmation Popups
- Prompt Popups
- Authentication Popups
- File Upload Popups
- File Download Popups
- Notification Popups
- Hidden Division / Overlay Popups

---

# 📊 Training Progress

| Area | Status |
|:---|:---:|
| 🧪 Manual Testing | ✅ Completed |
| 🗄️ SQL | ✅ Completed |
| ☕ Core Java | ✅ Completed |
| 🌐 Selenium with Java | 🔄 In Progress |
| 📚 Selenium Training Material | 🟢 120+ Pages Covered |
| 🖥️ Automation Testing | 🔄 In Progress |
| 📊 Performance Testing | ⏳ Upcoming |

---

# 🗂️ Repository Structure

```text
Selenium_assessment/
│
├── 📁 Day_1/
│   └── Selenium Assessment Programs
│
├── 📁 Day_2/
│   ├── TestCase_1.java
│   ├── TestCase_2.java
│   ├── TestCase_3.java
│   └── Screenshot.png
│
└── 📄 README.md
```

Each assessment day is maintained separately to keep the learning journey
organized and easy to follow.

---

# 📅 Daily Assessment Journey

The repository grows alongside the Selenium training.

```text
Day 01  ━━━━━━━━━━━━━━━━━━━━━━━━ ✅ Completed
Day 02  ━━━━━━━━━━━━━━━━━━━━━━━━ ✅ Completed
Day 03  ━━━━━━━━━━━━━━━━━━━━━━━━ 🔄 Upcoming
Day 04  ━━━━━━━━━━━━━━━━━━━━━━━━ 🔜
Day 05  ━━━━━━━━━━━━━━━━━━━━━━━━ 🔜
...
```

New assessment folders will be added as the training progresses.

---

# 🧪 What I Practice

### 🔎 Locate

Identify web elements using suitable Selenium locator strategies.

### 🖱️ Interact

Perform browser interactions such as:

- Click
- Text entry
- Mouse hover
- Right click
- Double click
- Drag and drop
- Keyboard actions

### ⚡ Handle

Work with:

- Dropdowns
- Auto-suggestions
- Iframes
- Alerts
- Popups
- Windows
- Disabled elements
- Hidden elements

### ⏱️ Synchronize

Apply appropriate waits to synchronize Selenium execution with
application behavior.

### ✅ Validate

Verify:

- Text
- Attributes
- Element state
- URLs
- Visibility
- Selection
- Enablement

### 📸 Capture

Capture screenshots whenever required as execution evidence.

---

# 🛠️ Technology Stack

| Category | Technology |
|:---|:---|
| 💻 Programming Language | Java |
| 🧪 Automation Tool | Selenium WebDriver |
| 🌐 Browser | Google Chrome |
| 💻 IDE | Eclipse |
| 🔎 Locators | XPath, CSS Selector & Selenium Locators |
| ⚡ Browser Scripting | JavaScriptExecutor |
| ⏱️ Synchronization | Implicit, Explicit & Fluent Wait |
| 🖱️ User Interaction | Actions Class |
| 📋 Dropdown Handling | Select Class |
| 📸 Evidence | Screenshots |

---

# ⚙️ Project Setup

## Prerequisites

Before running the automation programs, make sure the following are available:

- ☕ Java JDK
- 💻 Eclipse IDE
- 🌐 Google Chrome
- 🧪 Selenium Java
- 📦 Required Selenium dependencies
- 🌍 Internet connection

---

# 🚀 Clone the Repository

```bash
git clone https://github.com/Swati-Sahu14/Selenium_assessment.git
```

Open the cloned project in Eclipse and configure the required Selenium
dependencies.

---

# ▶️ Run an Assessment

```text
1. Open the project in Eclipse
2. Navigate to the required Day folder
3. Open the assessment Java class
4. Verify Selenium dependencies
5. Verify browser configuration
6. Run the class as a Java Application
7. Observe the browser automation
8. Verify the expected result
```

---

# 🎯 Repository Goal

This repository is not simply a collection of assignment files.

It tracks the progression from **learning Selenium concepts** to applying those
concepts through practical browser automation.

```text
             LEARN
               ↓
          UNDERSTAND
               ↓
          IMPLEMENT
               ↓
           EXECUTE
               ↓
           VALIDATE
               ↓
            DEBUG
               ↓
           IMPROVE
```

---

# 👩‍🏫 Assessment Source

The Selenium assessment requirements are shared through the trainer's
central repository.

### Pooja Mula — Selenium Assessment

🔗 https://github.com/poja-mula/Selenium_Assessment

The trainer's repository contains the **assessment requirements**.

This repository contains **my individual implementations** of those
assessments.

---

# 📈 What's Next?

As the Selenium training continues, this repository will expand with
additional concepts, assessments and practical automation scenarios.

```text
Individual Selenium Programs
            ↓
Better Locator Strategies
            ↓
Reliable Synchronization
            ↓
Complex Browser Interactions
            ↓
Reusable Automation Logic
            ↓
Maintainable Test Automation
```

---

# 💡 Learning Philosophy

<div align="center">

### Understand the concept.

### Write the automation.

### Run it.

### Break it.

### Debug it.

### Make it better.

</div>

---

# 🤝 Connect

<div align="center">

<a href="https://github.com/Swati-Sahu14">
<img src="https://img.shields.io/badge/GitHub-Swati--Sahu14-181717?style=for-the-badge&logo=github&logoColor=white"/>
</a>

&nbsp;&nbsp;

<a href="https://www.linkedin.com/in/swati-sahu02/">
<img src="https://img.shields.io/badge/LinkedIn-Swati%20Sahu-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white"/>
</a>

</div>

<br/>

<div align="center">

### 🧪 One assessment at a time.
### 💻 One concept at a time.
### 🚀 One step closer to becoming an automation engineer.

</div>
