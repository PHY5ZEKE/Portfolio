
<style>
    .carousel-item>img{
        object-fit:fill !important;
    }
    #carouselExampleControls .carousel-inner{
        height:280px !important;
    }
    #search-field .form-control.rounded-pill{
        border-top-right-radius:0 !important;
        border-bottom-right-radius:0 !important;
        border-right:none !important
    }
    #search-field .form-control:focus{
        box-shadow:none !important;
    }
    #search-field .form-control:focus + .input-group-append .input-group-text{
        border-color: #86b7fe !important
    }
    #search-field .input-group-text.rounded-pill{
        border-top-left-radius:0 !important;
        border-bottom-left-radius:0 !important;
        border-right:left !important
    }
    .post-item{
        transition:all .2s ease-in-out;
    }
    .post-item:hover{
        transform:scale(1.02);
    }
</style>
<section class="py-3">

        </div>
       
        
        <section class="highlight-phone" style="height: 460.55px;font-size: 21px;">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="intro">
                    <?php if($_settings->userdata('id') > 0 && $_settings->userdata('type') == 2): ?>
                        <h6 style="font-family: Blinker, sans-serif;font-weight: bold;font-size: 30px;">Hi there! Welcome to,&nbsp;</h6>
                        <h1 style="font-size: 85px;margin-bottom: 18px;margin-top: 18px;font-family: 'Architects Daughter', serif;font-weight: bold;letter-spacing: 4px;">Univenture</h1>
                        <p style="font-family: Roboto, sans-serif;font-size: 20px;width: 550px;">Univenture is the student's go to website for everything outside school. From food spots to entertainment, this site will surely show you the places you didn't know existed. All of which are provided by current students and graduates!</p>
                        <a class="btn btn-primary border rounded-pill" role="button" href="./?p=posts/manage_post" style="background: #f4d75c;color: #37577c;font-size: 18px;">Create A Thread</a>
                        <?php else: ?>
                        <h6 style="font-family: Blinker, sans-serif;font-weight: bold;font-size: 30px;">Hi there! Welcome to,&nbsp;</h6>
                        <h1 style="font-size: 85px;margin-bottom: 18px;margin-top: 18px;font-family: 'Architects Daughter', serif;font-weight: bold;letter-spacing: 4px;">Univenture</h1>
                        <p style="font-family: Roboto, sans-serif;font-size: 20px;width: 550px;">Univenture is the student's go to website for everything outside school. From food spots to entertainment, this site will surely show you the places you didn't know existed. All of which are provided by current students and graduates!</p>
                        <a class="btn btn-primary border rounded-pill" role="button" href="./login.php" style="background: #f4d75c;color: #37577c;font-size: 18px;">Login to Create Thread</a>
                        <?php endif; ?>
                    </div>
                </div>
                
                <div class="col-sm-4">
                    <div class="d-none d-md-block phone-mockup"><img src="../univ/uploads/logo.png" style="width: 450px;"></div>
                </div>
            </div>
        </div>
         </section>

         <link rel="stylesheet" href="assets/css/styles1.css">
         <section class="features-boxed" style="margin-top: 50px;margin-bottom: 50px;">
        <div class="container">
            <div class="intro">
                <h2 class="text-center" style="font-family: Blinker, sans-serif;font-weight: bold;font-size: 50px;">Features </h2>
                <p class="text-center" style="font-family: Roboto, sans-serif;">Univenture features various functionalities which will give you a smooth and exciting time exploring!</p>
            </div>
            <div class="row justify-content-center features" id="features">
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round" class="icon icon-tabler icon-tabler-external-link icon" style="color: #37577c;">
                            <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
                            <path d="M11 7h-5a2 2 0 0 0 -2 2v9a2 2 0 0 0 2 2h9a2 2 0 0 0 2 -2v-5"></path>
                            <line x1="10" y1="14" x2="20" y2="4"></line>
                            <polyline points="15 4 20 4 20 9"></polyline>
                        </svg>
                        <h3 class="name" style="font-family: Blinker, sans-serif;font-size: 24px;">Extensive</h3>
                        <p class="description" style="font-family: Roboto, sans-serif;font-size: 18px;">Univenture extends from various universities and colleges which allows it to become a very diverse website.</p>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="fa fa-clock-o icon" style="color: #37577c;"></i>
                        <h3 class="name" style="font-family: Blinker, sans-serif;font-size: 24px;">Always available</h3>
                        <p class="description" style="font-family: Roboto, sans-serif;font-size: 18px;">The site will always be available to be accessed by every student. 24 hours, 7 days a week.</p>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="fa fa-users icon" style="color: #37577c;"></i>
                        <h3 class="name" style="font-family: Blinker, sans-serif;font-size: 24px;">User-Based</h3>
                        <p class="description" style="font-family: Roboto, sans-serif;font-size: 18px;">Experiences all come from various users who are willing to share their experience while also gaining new insights.</p>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em" viewBox="0 0 24 24" fill="none" class="icon" style="width: 60px;height: 60px;color: #37577c;">
                            <path d="M17 15H19V17H17V15Z" fill="currentColor"></path>
                            <path d="M19 11H17V13H19V11Z" fill="currentColor"></path>
                            <path fill-rule="evenodd" clip-rule="evenodd" d="M13 7H23V21H1V3H13V7ZM8 5H11V7H8V5ZM11 19V17H8V19H11ZM11 15V13H8V15H11ZM11 11V9H8V11H11ZM21 19V9H13V11H15V13H13V15H15V17H13V19H21ZM3 19V17H6V19H3ZM3 15H6V13H3V15ZM6 11V9H3V11H6ZM3 7H6V5H3V7Z" fill="currentColor"></path>
                        </svg>
                        <h3 class="name" style="font-family: Blinker, sans-serif;font-size: 24px;">Organized and Arranged</h3>
                        <p class="description" style="font-family: Roboto, sans-serif;font-size: 18px;">Univenture is organized and arranged in various categories which will give the user control on what they want to see.</p>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="material-icons icon" style="color: #37577c;">flash_auto</i>
                        <h3 class="name" style="font-family: Blinker, sans-serif;font-size: 24px;">Fast </h3>
                        <p class="description" style="font-family: Roboto, sans-serif;font-size: 18px;">The site is built to be quick and easily accessible by users to lessen the time loading and increase the time exploring.</p>
                    </div>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-4 item">
                    <div class="box"><i class="material-icons icon" style="color: #37577c;">feedback</i>
                        <h3 class="name" style="font-family: Blinker, sans-serif;font-size: 24px;">Feedback-Open</h3>
                        <p class="description" style="font-family: Roboto, sans-serif;font-size: 18px;">Univenture allows for users to send feedback on existing bugs and possible improvements that can be done.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

        