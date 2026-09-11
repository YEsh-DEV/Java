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
├── Lab3/
│   ├── snf.java                  # Student & Faculty marks entry/viewing
│   └── keywords.java             # Java keywords (super, this, final)
├── Lab4/
│   ├── SingleInheritance.java        # Single inheritance (Dog extends Animal)
│   ├── MultilevelInheritance.java    # Multilevel inheritance (Puppy extends Dog extends Animal)
│   ├── HierarchicalInheritance.java  # Hierarchical inheritance (Dog & Cat extend Animal)
│   ├── HybridInheritance.java        # Hybrid inheritance (Puppy extends Dog implements Pet)
│   ├── Operations.java               # Class with math operations (avg, min, max, median, std dev)
│   └── GradesStatistics.java         # Reads grades and displays statistics using Operations
├── .gitignore                        # Excludes compiled .class files and IDE meta-files
├── run_labs.ps1                      # Interactive PowerShell script to run exercises
└── README.md                         # Documentation
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

### 🔹 Lab 3: Classes & Java Keywords

#### 5. [`snf.java`](file:///Lab3/snf.java)
Demonstrates interaction between classes (`Student` and `Faculty`) for entering and viewing marks.

#### 6. [`keywords.java`](file:///Lab3/keywords.java)
Demonstrates Java keywords such as `this`, `super`, and `final`.

---

### 🔹 Lab 4: Inheritance & Grade Statistics

#### 7. [`SingleInheritance.java`](file:///Lab4/SingleInheritance.java)
Demonstrates Single Inheritance (`Dog` extends `Animal`).

#### 8. [`MultilevelInheritance.java`](file:///Lab4/MultilevelInheritance.java)
Demonstrates Multilevel Inheritance (`Puppy` extends `Dog` extends `Animal`).

#### 9. [`HierarchicalInheritance.java`](file:///Lab4/HierarchicalInheritance.java)
Demonstrates Hierarchical Inheritance (`Dog` and `Cat` extend `Animal`).

#### 10. [`HybridInheritance.java`](file:///Lab4/HybridInheritance.java)
Demonstrates Hybrid Inheritance (`Puppy` extends `Dog` implements `Pet`).

#### 11. [`Operations.java`](file:///Lab4/Operations.java) & [`GradesStatistics.java`](file:///Lab4/GradesStatistics.java)
- **`Operations.java`:** Contains methods to compute average, minimum, maximum, median, and standard deviation.
- **`GradesStatistics.java`:** Reads $n$ grades (0–100), validates input, invokes `Operations` methods, and formats floating-point values to 2 decimal places.

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

#### **Lab 3 - Student and Faculty**
```bash
javac Lab3/snf.java
java -cp Lab3 Main
```

#### **Lab 3 - Keywords Demo**
```bash
javac Lab3/keywords.java
java -cp Lab3 keywords
```

#### **Lab 4 - Single Inheritance**
```bash
javac Lab4/SingleInheritance.java
java -cp Lab4 SingleInheritance
```

#### **Lab 4 - Multilevel Inheritance**
```bash
javac Lab4/MultilevelInheritance.java
java -cp Lab4 MultilevelInheritance
```

#### **Lab 4 - Hierarchical Inheritance**
```bash
javac Lab4/HierarchicalInheritance.java
java -cp Lab4 HierarchicalInheritance
```

#### **Lab 4 - Hybrid Inheritance**
```bash
javac Lab4/HybridInheritance.java
java -cp Lab4 HybridInheritance
```

#### **Lab 4 - Grade Statistics**
```bash
javac -cp Lab4 Lab4/GradesStatistics.java
java -cp Lab4 GradesStatistics
```

---
*Created and maintained by [Yeshwanth Atmakuri](https://github.com/YEsh-DEV).*
