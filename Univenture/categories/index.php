<style>
    #categoryAccordion button.btn.btn-block.text-left.font-weight-bolder:focus {
        box-shadow: none !important;
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
</style>
<div class="section py-5">
    <div class="container">
        <h3 class="text-center"><b>Topic Categories</b></h3>
        <hr>
        <div class="row justify-content-center">
            <div class="col-lg-8 col-md-10 col-sm-12 col-sm-12 mb-3">
                <div class="input-group input-group-lg" id="search-field">
                    <input type="search" class="form-control form-control-lg  rounded-pill" aria-label="Search Category Field" id="search" placeholder="Search category here">
                    <div class="input-group-append">
                        <span class="input-group-text rounded-pill bg-transparent"><i class="fa fa-search"></i></span>
                    </div>
                </div>
            </div>
        </div>
        <div class="accordion" id="categoryAccordion">
            <?php 
            $categorys = $conn->query("SELECT * FROM `category_list` where delete_flag = 0 and `status` = 1 order by `name` asc");
            while($row = $categorys->fetch_assoc()):
            ?>
            <div class="card mb-0 rounded-0">
                <div class="card-header" id="category<?= $row['id'] ?>">
                    <h2 class="mb-0">
                        <button class="btn btn-block text-left font-weight-bolder" type="button" data-toggle="collapse" data-target="#collapse<?= $row['id'] ?>" aria-expanded="false" aria-controls="collapse<?= $row['id'] ?>">
                        <div class="d-flex w-100 align-items-center justify-content-between">
                        <img src="<?= validate_image($row['img']) ?>"width="80" height="80"><?= $row['name'] ?>
                            <i class="fa fa-plus font-size-3 collapse-icon"></i>
                        </div>
                        </button>
                    </h2>
                </div>
                <div id="collapse<?= $row['id'] ?>" class="collapse category_collapse" aria-labelledby="category<?= $row['id'] ?>" data-parent="#categoryAccordion">
                    <div class="card-body">
                        <p><?= str_replace(["\n\r","\n","\r"], "<br/>", $row['description']) ?></p>
                    </div>
                </div>
            </div>
            <?php endwhile; ?>
        </div>
    </div>
</div>
<script>
    $(function(){
        $('.category_collapse').on('show.bs.collapse',function(){
            var card = $(this).closest('.card')
            var icon = card.find('.collapse-icon')
            icon.removeClass('fa-plus').addClass('fa-minus')
        })
        $('.category_collapse').on('hide.bs.collapse',function(){
            var card = $(this).closest('.card')
            var icon = card.find('.collapse-icon')
            icon.removeClass('fa-minus').addClass('fa-plus')
        })
        $('#search').on('input', function(){
            var _search = $(this).val().toLowerCase()
            $('#categoryAccordion .card').each(function(){
                var _text = $(this).text().toLowerCase()
                _text = _text.trim()
                if(_text.includes(_search) === false){
                    $(this).toggle(false)
                }else{
                    $(this).toggle(true)
                }
            })
        })
    })
</script>


<div class="row row-cols-xl-4 row-cols-md-3 row-cols-sm-1 gx-2 gy-2">
            <?php 
            $posts = $conn->query("SELECT p.*, c.name as `category` FROM `post_list` p inner join category_list c on p.category_id = c.id where p.status = 1  and p.`delete_flag` = 0 order by abs(unix_timestamp(p.date_created)) desc");
            while($row = $posts->fetch_assoc()):
            ?>

            
            <div class="col post-item">
                <a href="./?p=posts/view_post&id=<?= $row['id'] ?>" class="card rounded-0 shadow text-decoration-none text-reset">
                    <div class="card-body">
                        <div class="mb-2 text-right">
                                <small class="badge badge-light border text-dark rounded-pill px-3"><i class="far fa-circle"></i> <?= $row['category'] ?></small>
                        </div>
                        <h3 class="card-title w-100 font-weight-bold"><?= $row['title'] ?></h3>
                        <div class="card-text truncate-3 text-muted text-sm"><?= strip_tags($row['content']) ?></div>
                        <div class="mb-2 text-right">
                            <small class="text-muted"><i><?= date("Y-m-d h:i A", strtotime($row['date_created'])) ?></i></small>
                        </div>
                        <div class="mb-2 text-left">
                            <small class="text-muted"><i><?= ($row['location']) ?></i></small>
                        </div>
                    </div>
                </a>
            </div>
            <?php endwhile; ?>
        </div>
    </div>
</section>

<script>
    $(function(){
        $('#search').on('input', function(){
            var _search = $(this).val().toLowerCase()
            $('.post-item').each(function(){
                var _text = $(this).text().toLowerCase()
                _text = _text.trim()
                if(_text.includes(_search) === false){
                    $(this).toggle(false)
                }else{
                    $(this).toggle(true)
                }
            })
        })
    })
</script>
