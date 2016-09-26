<%@include file="security.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file ="navbar.jsp" %>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>SRA | Home</title>
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="plugins/datatables/dataTables.bootstrap.css"> 
    </head>
    <body class="hold-transition skin-blue sidebar-mini">

        <div class="wrapper">

            <div class="content-wrapper">
                <section class="content-header">

                    <h1>
                        Create New Recommendation
                        <small>***Subjective***</small>
                    </h1>
                </section>
                <section class="content">
                    <div class="row">
                        <form id="frm-example" action="CreateNewProject">
                            
                            <div class="col-md-6">
                                <div class="box box-solid box-success">
                                    <div class="box-header with-border">
                                        <h3 class="box-title">Recommendation Details</h3>
                                    </div>
                                    <br>
                                    <div class="box-body">
                                        <div class="form-group">
                                            <label for="projectname" class="control-label">Title</label>
                                            <input type="text" class="form-control" name="projectname" id="projectname" placeholder="Name...">
                                        </div>
                                        <div class="form-group">
                                            <label>Period:</label>
                                            <select class="form-control">
                                                <option>Planting</option>
                                                <option>Maturing</option>
                                                <option>Harvesting</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label>Type of Recommendation</label>
                                            <select class="form-control">
                                                <option>Advice</option>
                                                <option>Trial Testing</option>
                                                <option>Techniques</option>
                                            </select>
                                        </div>
                                        <div  class="form-group">
                                            <label class="control-label" for="datepicker" >Date Start:</label>
                                            <div class="input-group date">
                                                <div class="input-group-addon">
                                                    <i class="fa fa-calendar"></i>
                                                </div>
                                                <input type="text" class="form-control pull-right datepicker" name="datepicker" id="datepickerstart">
                                            </div>
                                            <!-- /.input group -->
                                        </div>


                                  
                                    <div  class="form-group">
                                        <label class="control-label" for="dateend" >Date End:</label>
                                        <div class="input-group date">
                                            <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                            <input type="text" class="form-control pull-right datepicker" name="dateend" id="datepickerend">
                                        </div>
                                        <!-- /.input group -->
                                    </div>

                                    <div class="form-group">
                                        <label>Description</label>
                                        <textarea class="form-control" name="Description" rows="2"  placeholder="Enter ..."></textarea>
                                    </div>
  </div>

                                </div>
                            </div>

<div class="col-md-6" > 
                                <div class="box box-info">
                                    <div class="box-header">
                                        <h1 class="box-title">To: </h1>
                                      
                                    </div>

                                    <div class="box-body ">

                                    <table class="table table-hover table-no-bordered">
                                        <tbody><tr>
                                                <th>Farmer Name</th>
                                              
                                            </tr>
                                            <tr>
                                                <td>John Doe</td>
                                            
                                            </tr>

                                            <tr>
                                                <td href="">henry ford</td>
                                           
                                            </tr>
                                            <tr>

                                                <td href="">Michael Johnathan</td>
                                               
                                            </tr>
                                            <tr>
                                                <td href="ff">Danny Frisk</td>
                                              
                                            </tr>
                                        </tbody>
                                    </table>


                                </div>

                                </div>

                            </div>
                            <div class="col-md-6" > 
                                <div class="box box-info">
                                    <div class="box-header with-border">
                                        <h1 class="box-title">Problems List <small>Optional</small></h1>
                                        <div class="box-tools pull-right">
                                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                                            <button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                                        </div>
                                    </div>

                                    <div class="box-body">
                                        <table id="probTable" class="table  dispTable table-hover" cellspacing="0" width="100%">
                                            <thead>
                                                <tr>
                                                    <th><input name="select_all" value="1" id="probTable-select-all" type="checkbox" /></th>
                                                    <th>Problem</th>
                                                    <th>Description</th>
                                                </tr>
                                            </thead>
                                            <tfoot>
                                                <tr>
                                                    <th></th>
                                                    <th>Problem</th>
                                                    <th>Description</th>

                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>

                                </div>
                            </div> 
                            
                            <div class="col-md-2">                   
                                <p><button class="btn btn-primary" style="width: 100%" value="submit">Submit</button></p>
                            </div>
                        </form>
                    </div>
                </section>
            </div>


        </div>

        <footer class="main-footer">

            <div class="pull-right hidden-xs">
                <b>Version</b> 2.3.3
            </div>
            <strong>Copyright &copy; 2014-2015 <a href="http://sra.com">Sugar Regulatory Association</a>.</strong>
        </footer>
    </div>


    <script type="text/javascript" src="plugins/jQuery/jQuery-2.2.0.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="dist/js/app.min.js"></script>
    <script src="Highcharts/highcharts.js"></script>
    <script src="plugins/datatables/jquery.dataTables.min.js"></script>
    <script src="plugins/datatables/dataTables.bootstrap.min.js"></script>
    <script type="text/javascript" src="plugins/datatable/dataTables.checkboxes.min.js"></script>
    <script src="plugins/datepicker/bootstrap-datepicker.js"></script>
    <script>
        $(function () {
            $('.datepicker').datepicker({
                autoclose: true
            });
        });</script>
    <script>

        $(document).ready(function () {
            var rows_selected = [];
            var table1 = $('#probTable').DataTable({
                'ajax': {
                    'url': 'viewProblemList'
                },
                'columnDefs': [{
                        'targets': 0,
                        'searchable': false,
                        'orderable': false,
                        'className': 'dt-body-center',
                        'render': function (data, type, full, meta) {
                            return '<input type="checkbox" name="probid[]"  value="'
                                    + $('<div/>').text(data).html() + '">';
                        }
                    }],
                'select': {
                    'style': 'multi'
                },
                'order': [[1, 'asc']]

            });
            table1.$('input[type="checkbox"]').each(function () {
                // If checkbox doesn't exist in DOM
                if (!$.contains(document, this)) {
                    // If checkbox is checked
                    if (this.checked) {
                        // Create a hidden element 
                        $(form).append(
                                $('<input>')
                                .attr('type', 'hidden')
                                .attr('name', this.name)
                                .val(this.value)
                                );
                    }
                }
            });

            $('#probTable-select-all').on('click', function () {
                // Check/uncheck all checkboxes in the table
                var rows = table1.rows({'search': 'applied'}).nodes();
                $('input[type="checkbox"]', rows).prop('checked', this.checked);
            });
        });
</script>
</body>

</html>