<!DOCTYPE html>
<html>
    <head>
        <title>Kaltas:Income Tax Calculator</title>
        <!--CSS-->
        <link href="style.css" rel="stylesheet">
        <!--Bootstrap-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <!--Font-->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro&family=Playfair+Display&display=swap" rel="stylesheet">
    </head>

    <body>
        <!--CSS-->
        <link href="style.css" rel="stylesheet">
    <nav class="navbar-custom">
            <div class="container-fluid">
              <a class="navbar-brand" href="#">
                <img src="logo.png" alt="Logo" height ="60" class="d-inline-block align-text-top">
              </a>
            </div>
          </nav>
          <br>
       <div class ="box">
        
            <div class="panel">
              <div class="header">
               <center> <h2>Income Tax Calculator</h2></center>
              </div>
              <div class="calculator">
                <form action ="index.php" method="get">
                    <div class="row mb-3">
                      <label for="inputSalary" class="col-sm-2 col-form-label d-flex justify-content-center">Salary:</label>
                      <div class="col-sm-10">
                        <input type="number" class="form-control" id="inputSalary" name ="salary" required>
                      </div>
                    </div>
                    <center>Type:
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="type" id="inlineRadio1" value="Bi-monthly" required>
                        <label class="form-check-label" for="inlineRadio1">Bi-monthly</label>
                      </div>
                      <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="type" id="inlineRadio2" value="Monthly" required>
                        <label class="form-check-label" for="inlineRadio2">Monthly</label>
                      </div>
                    </center>
                    <br>
                    <center><input class ="button" type ="submit" name="compute"><center>
                    <br>
                    <?php  

    if(isset($_GET['compute'])) 
    {
                    
                        $salary = $_GET["salary"] ;
                        $salaryType = $_GET["type"];
                        $excess;
                        $annualTax;
                        $monthlyTax;
                        
                    
                        if($salaryType == "Monthly" )
                        {
                            $salary*=12;
                            if($salary<=250000.0)
                            {
                                $monthlyTax = 0.0;
                                $annualTax =0.0;
                            }
                            else if($salary >250000.0 && $salary <= 400000.0)
                            {
                                $excess =  $salary-250000.0;
                                $annualTax = $excess*0.2;
                                $monthlyTax = $annualTax/12;
                            }
                            else if($salary >400000.0 && $salary <= 800000.0)
                            {
                                $excess =  $salary-400000.0;
                                $annualTax = 30000+$excess*0.25;
                                $monthlyTax = $annualTax/12;
                            }
                            else if($salary >800000.0 && $salary <= 2000000.0)
                            {
                                $excess =  $salary-800000.0;
                                $annualTax = 130000+$excess*0.30;
                                $monthlyTax = $annualTax/12;
                            }
                            else if($salary >2000000.0 && $salary <= 8000000.0)
                            {
                                $excess =  $salary-2000000.0;
                                $annualTax = 490000+$excess*0.32;
                                $monthlyTax = $annualTax/12;
                            }
                            else if($salary >8000000.0)
                            {
                                $excess =  $salary-8000000.0;
                                $annualTax = 2410000+$excess*0.35;
                                $monthlyTax = $annualTax/12;
                            }
                            echo "Annual Salary: PHP ".number_format($salary,2)."<br>"; 
                            echo "Est Annual Tax: PHP ".number_format($annualTax,2)."<br>";
                            echo "Est Monthly Tax: PHP ".number_format($monthlyTax,2)."<br>" ;
                        }
                        if($salaryType == "Bi-monthly" )
                        {
                            $salary*=24;
                            if($salary<=250000.0)
                            {
                                $monthlyTax = 0.0;
                                $annualTax =0.0;
                            }
                            else if($salary >250000.0 && $salary <= 400000.0)
                            {
                                $excess =  $salary-250000.0;
                                $annualTax = $excess*0.2;
                                $monthlyTax = $annualTax/12;
                            }
                            else if($salary >400000.0 && $salary <= 800000.0)
                            {
                                $excess =  $salary-400000.0;
                                $annualTax = 30000+$excess*0.25;
                                $monthlyTax = $annualTax/12;
                            }
                            else if($salary >800000.0 && $salary <= 2000000.0)
                            {
                                $excess =  $salary-800000.0;
                                $annualTax = 130000+$excess*0.30;
                                $monthlyTax = $annualTax/12;
                            }
                            else if($salary >2000000.0 && $salary <= 8000000.0)
                            {
                                $excess =  $salary-2000000.0;
                                $annualTax = 490000+$excess*0.32;
                                $monthlyTax = $annualTax/12;
                            }
                            else if($salary > 8000000.0)
                            {
                                $excess =  $salary-8000000.0;
                                $annualTax = 2410000+($excess*0.35);
                                $monthlyTax = $annualTax/12;
                            }
                            echo "Annual Salary: PHP ".number_format($salary,2)."<br>"; 
                            echo "Est Annual Tax: PHP ".number_format($annualTax,2)."<br>";
                            echo "Est Monthly Tax: PHP ".number_format($monthlyTax,2)."<br>" ;
                        }
                            
    }
                        
                    ?>
                    
                </form>
              </div>
            </div>
        </div>
        
        
    </body>
</html>

 