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
    Write-Host "[5] Run All Exercises"
    Write-Host "[6] Exit"
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
    $compilerOutput = javac $Path 2>&1
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
    $choice = Read-Host "Enter your choice (1-6)"
    
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
            Clear-Host
            Write-Host "--- Running All Exercises ---`n" -ForegroundColor Cyan
            
            Write-Host "1/4: ConditionalDemo" -ForegroundColor Yellow
            javac Lab1\ConditionalDemo.java
            java -cp Lab1 ConditionalDemo
            
            Write-Host "`n2/4: LoopControlDemo" -ForegroundColor Yellow
            javac Lab1\LoopControlDemo.java
            java -cp Lab1 LoopControlDemo
            
            Write-Host "`n3/4: EntitiesDemo" -ForegroundColor Yellow
            javac Lab2\EntitiesDemo.java
            java -cp Lab2 EntitiesDemo
            
            Write-Host "`n4/4: MyStringDemo" -ForegroundColor Yellow
            javac Lab2\MyStringDemo.java
            java -cp Lab2 MyStringDemo
            
            # Clean up all class files
            Get-ChildItem -Recurse -Filter "*.class" | Remove-Item
            Read-Host "`nAll exercises executed. Press Enter to return to menu..."
        }
        "6" {
            Write-Host "Goodbye!" -ForegroundColor Green
            break
        }
        default {
            Write-Host "Invalid choice. Please enter 1 to 6." -ForegroundColor Red
            Start-Sleep -Seconds 1
        }
    }
} while ($choice -ne "6")
