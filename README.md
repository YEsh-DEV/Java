# Java Lab Exercises 🚀

A structured collection of Java programming exercises demonstrating fundamental syntax, control flow statements, object-oriented design, and custom class modeling.

---

## 📁 Repository Structure

```text
Java Lab/
├── Lab1/
│   ├── ConditionalDemo.java      # Conditional statements (if-else, switch)
│   └── LoopControlDemo.java       # Loop mechanisms (for, while, do-while, break/continue)
├── Lab2/
│   ├── EntitiesDemo.java         # OOP structure modeling Student, Faculty, Employee, and Library
│   └── MyStringDemo.java         # Custom string wrapper modeling common operations (length, reverse, split)
├── .gitignore                    # Excludes compiled .class files and IDE meta-files
├── run_labs.ps1                  # Interactive PowerShell script to run exercises
└── README.md                     # Documentation
```

---

## 💻 Exercise Details

### 🔹 Lab 1: Fundamentals & Control Flow

#### 1. [`ConditionalDemo.java`](file:///Lab1/ConditionalDemo.java)
Demonstrates decision-making constructs in Java.
- **If-Else Ladder:** Computes grade classification based on numerical score inputs.
- **Switch Case:** Matches week numbers to day names with break statements.

#### 2. [`LoopControlDemo.java`](file:///Lab1/LoopControlDemo.java)
Demonstrates iterative constructs and control flow modification.
- **For Loop:** Standard progressive counter.
- **While Loop:** Countdown timer.
- **Do-While Loop:** Ensures loop body executes at least once.
- **Break & Continue:** Fine-tuning loop execution based on conditional flags.

---

### 🔹 Lab 2: Object-Oriented Modeling

#### 3. [`EntitiesDemo.java`](file:///Lab2/EntitiesDemo.java)
Demonstrates basic class structure, encapsulation, instantiation, and field/method invocation in Java.
Models four key entity types representing a university environment:
- **`Student`:** Tracks name, ID, and enrolled course.
- **`Faculty`:** Tracks name, ID, and department.
- **`Employee`:** Tracks name, ID, and salary details.
- **`Library`:** Models university central library catalog metadata.

#### 4. [`MyStringDemo.java`](file:///Lab2/MyStringDemo.java)
Builds a custom wrapper class (`MyString`) around the primitive String operations to show key algorithms:
- **Length calculation:** Retrieves underlying character array length.
- **Custom Reverse:** Iteratively reverses characters using indexing (without using `StringBuilder.reverse()`).
- **Replace/Case Conversion:** Exercises basic built-in replacements and casing.
- **Splitting:** Divides text based on specified delimiters.

---

## 🚀 How to Compile and Run

### 🛠️ Prerequisites
Ensure that the Java Development Kit (JDK) is installed and available in your PATH:
```bash
java -version
javac -version
```

### ⚡ Option A: Interactive Runner (Recommended)
An interactive PowerShell script is provided to compile, execute, and automatically clean up `.class` files. Run it in your terminal:
```powershell
./run_labs.ps1
```

### 📝 Option B: Manual Execution
To compile and run individual programs manually:

#### **Lab 1 - Conditional Demo**
```bash
javac Lab1/ConditionalDemo.java
java -cp Lab1 ConditionalDemo
```

#### **Lab 1 - Loop Control Demo**
```bash
javac Lab1/LoopControlDemo.java
java -cp Lab1 LoopControlDemo
```

#### **Lab 2 - Entities Demo**
```bash
javac Lab2/EntitiesDemo.java
java -cp Lab2 EntitiesDemo
```

#### **Lab 2 - Custom String Demo**
```bash
javac Lab2/MyStringDemo.java
java -cp Lab2 MyStringDemo
```

---
*Created and maintained by [Yeshwanth Atmakuri](https://github.com/YEsh-DEV).*
