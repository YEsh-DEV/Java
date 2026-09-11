# PowerShell script to compile and run Java Lab exercises

function Show-Menu {
    Clear-Host
    Write-Host "=========================================" -ForegroundColor Cyan
    Write-Host "       Java Lab Exercise Runner          " -ForegroundColor Cyan
    Write-Host "=========================================" -ForegroundColor Cyan
    Write-Host "Select an exercise to compile and run:" -ForegroundColor Yellow
    Write-Host ""
    Write-Host "[1] Lab 1 - Conditional Statements (ConditionalDemo)"
    Write-Host "[2] Lab 1 - Loop Control & Breaks (LoopControlDemo)"
    Write-Host "[3] Lab 2 - University Entities (EntitiesDemo)"
    Write-Host "[4] Lab 2 - Custom String Operations (MyStringDemo)"
    Write-Host "[5] Lab 3 - Student & Faculty Marks (snf)"
    Write-Host "[6] Lab 3 - Java Keywords (keywords)"
    Write-Host "[7] Lab 4 - Single Inheritance (SingleInheritance)"
    Write-Host "[8] Lab 4 - Multilevel Inheritance (MultilevelInheritance)"
    Write-Host "[9] Lab 4 - Hierarchical Inheritance (HierarchicalInheritance)"
    Write-Host "[10] Lab 4 - Hybrid Inheritance (HybridInheritance)"
    Write-Host "[11] Lab 4 - Grade Statistics (GradesStatistics)"
    Write-Host "[12] Run All Exercises"
    Write-Host "[13] Exit"
    Write-Host ""
}

function Run-JavaClass {
    param (
        [string]$Path,
        [string]$ClassName
    )
    
    $directory = Split-Path -Parent $Path
    $filename = Split-Path -Leaf $Path

    Write-Host "-----------------------------------------" -ForegroundColor Gray
    Write-Host "Compiling $filename..." -ForegroundColor Yellow
    
    # Run javac inside the correct directory
    $compilerOutput = javac -cp $directory $Path 2>&1
    if ($LASTEXITCODE -ne 0) {
        Write-Host "Compilation failed:" -ForegroundColor Red
        Write-Host $compilerOutput -ForegroundColor Red
        Read-Host "Press Enter to continue..."
        return
    }
    
    Write-Host "Compilation successful. Running $ClassName..." -ForegroundColor Green
    Write-Host "-----------------------------------------" -ForegroundColor Gray
    
    # Run java program
    java -cp $directory $ClassName
    
    Write-Host "-----------------------------------------" -ForegroundColor Gray
    # Clean up generated class files to keep workspace tidy
    Get-ChildItem -Path $directory -Filter "*.class" | Remove-Item
    
    Read-Host "`nPress Enter to return to menu..."
}

do {
    Show-Menu
    $choice = Read-Host "Enter your choice (1-13)"
    
    switch ($choice) {
        "1" {
            Run-JavaClass -Path "Lab1\ConditionalDemo.java" -ClassName "ConditionalDemo"
        }
        "2" {
            Run-JavaClass -Path "Lab1\LoopControlDemo.java" -ClassName "LoopControlDemo"
        }
        "3" {
            Run-JavaClass -Path "Lab2\EntitiesDemo.java" -ClassName "EntitiesDemo"
        }
        "4" {
            Run-JavaClass -Path "Lab2\MyStringDemo.java" -ClassName "MyStringDemo"
        }
        "5" {
            Run-JavaClass -Path "Lab3\snf.java" -ClassName "snf"
        }
        "6" {
            Run-JavaClass -Path "Lab3\keywords.java" -ClassName "keywords"
        }
        "7" {
            Run-JavaClass -Path "Lab4\SingleInheritance.java" -ClassName "SingleInheritance"
        }
        "8" {
            Run-JavaClass -Path "Lab4\MultilevelInheritance.java" -ClassName "MultilevelInheritance"
        }
        "9" {
            Run-JavaClass -Path "Lab4\HierarchicalInheritance.java" -ClassName "HierarchicalInheritance"
        }
        "10" {
            Run-JavaClass -Path "Lab4\HybridInheritance.java" -ClassName "HybridInheritance"
        }
        "11" {
            Run-JavaClass -Path "Lab4\GradesStatistics.java" -ClassName "GradesStatistics"
        }
        "12" {
            Clear-Host
            Write-Host "--- Running All Exercises ---`n" -ForegroundColor Cyan
            
            Write-Host "1/11: ConditionalDemo" -ForegroundColor Yellow
            javac Lab1\ConditionalDemo.java; java -cp Lab1 ConditionalDemo
            
            Write-Host "`n2/11: LoopControlDemo" -ForegroundColor Yellow
            javac Lab1\LoopControlDemo.java; java -cp Lab1 LoopControlDemo
            
            Write-Host "`n3/11: EntitiesDemo" -ForegroundColor Yellow
            javac Lab2\EntitiesDemo.java; java -cp Lab2 EntitiesDemo
            
            Write-Host "`n4/11: MyStringDemo" -ForegroundColor Yellow
            javac Lab2\MyStringDemo.java; java -cp Lab2 MyStringDemo

            Write-Host "`n5/11: snf" -ForegroundColor Yellow
            javac Lab3\snf.java; java -cp Lab3 snf

            Write-Host "`n6/11: keywords" -ForegroundColor Yellow
            javac Lab3\keywords.java; java -cp Lab3 keywords

            Write-Host "`n7/11: SingleInheritance" -ForegroundColor Yellow
            javac Lab4\SingleInheritance.java; java -cp Lab4 SingleInheritance

            Write-Host "`n8/11: MultilevelInheritance" -ForegroundColor Yellow
            javac Lab4\MultilevelInheritance.java; java -cp Lab4 MultilevelInheritance

            Write-Host "`n9/11: HierarchicalInheritance" -ForegroundColor Yellow
            javac Lab4\HierarchicalInheritance.java; java -cp Lab4 HierarchicalInheritance

            Write-Host "`n10/11: HybridInheritance" -ForegroundColor Yellow
            javac Lab4\HybridInheritance.java; java -cp Lab4 HybridInheritance

            Write-Host "`n11/11: GradesStatistics" -ForegroundColor Yellow
            javac -cp Lab4 Lab4\GradesStatistics.java
            Write-Host "Running GradesStatistics with sample input (3 grades: 80, 90, 100)..."
            "3`n80`n90`n100" | java -cp Lab4 GradesStatistics
            
            # Clean up all class files
            Get-ChildItem -Recurse -Filter "*.class" | Remove-Item
            Read-Host "`nAll exercises executed. Press Enter to return to menu..."
        }
        "13" {
            Write-Host "Goodbye!" -ForegroundColor Green
            break
        }
        default {
            Write-Host "Invalid choice. Please enter 1 to 13." -ForegroundColor Red
            Start-Sleep -Seconds 1
        }
    }
} while ($choice -ne "13")
