# 🚀 CodenBox Automation Lab Test Suite

This project is a Selenium-based automation test suite for the **CodenBox Automation Lab Practice Page**. It includes a comprehensive set of UI automation tests written in Java using the **TestNG** framework. These tests cover various common UI components and interactions to demonstrate automation capabilities.

---

## 📂 Project Structure

src/
└── codenboxautomationllab/
└── AppTest.java


---

## 🧪 Features & Test Cases

Each method in `AppTest.java` is a separate test case. Here's a breakdown:

| Test Method             | Description                                               |
|-------------------------|-----------------------------------------------------------|
| `RadioButtonTest`       | Randomly selects a radio button.                          |
| `DynamicDropDownTest`   | Tests auto-suggest dropdown with country names.           |
| `StaticDropDownTest`    | Selects a random option from a static dropdown.           |
| `CheckBoxTest`          | Randomly selects one of the checkboxes.                   |
| `SwitchWnidows`         | Opens a new window and switches between windows.          |
| `SwitchTab`             | Opens a new tab and switches between tabs.                |
| `AlertTag`              | Handles alert and confirm popups.                         |
| `TableTest`             | Prints table data from the product table.                 |
| `HideTest`              | Tests hiding an input field.                              |
| `ShowTest`              | Tests showing a hidden input field.                       |
| `DisableTest`           | Tests disabling an input field.                           |
| `EnableTest`            | Tests enabling a previously disabled input.               |
| `MouseHover`            | Performs mouse hover and clicks "Top" and "Reload".       |
| `BookingCalenderTest`   | Opens calendar booking tab and prints available dates.    |
| `IframeTest`            | Switches to an iframe and interacts with a menu.          |
| `DownloadApkFile`       | Downloads an APK file.                                    |

> ℹ️ **Note:** Most test cases are currently disabled (`enabled = false`). Enable them individually based on your testing needs.

---

## 🛠️ Tech Stack

- Java  
- Selenium WebDriver  
- TestNG  
- ChromeDriver  

---

## ✅ Prerequisites

- Java JDK 8+
- Chrome browser
- Maven (optional, for dependency management)
- ChromeDriver (ensure it's in your system `PATH`)

---

## ▶️ How to Run the Tests

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/yourrepo.git
    cd yourrepo
    ```

2. Add TestNG and Selenium dependencies to your `pom.xml` (if using Maven):
    ```xml
    <dependencies>
      <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.10.0</version>
      </dependency>
      <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.7.0</version>
        <scope>test</scope>
      </dependency>
    </dependencies>
    ```

3. Run your tests via TestNG:
    - From your IDE (e.g., right-click → Run `AppTest`)
    - Or using the command line with `testng.xml` if you create one

---

## 🧹 Notes & Improvements

- Use `@AfterTest` to gracefully close the browser after tests
- Implement **Page Object Model (POM)** for better test structure
- Add assertions to verify expected outcomes
- Replace `Thread.sleep()` with `WebDriverWait` for reliability
- Enable only one `@Test(enabled = true)` when debugging

---

## 📄 License

This project is intended for **educational and practice purposes only**.

-

