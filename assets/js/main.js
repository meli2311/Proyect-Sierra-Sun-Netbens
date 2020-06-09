//Sidebar functionality
$("#menu-toggle").click(function(e) {
  e.preventDefault();
  $("#content-wrapper").toggleClass("toggled");
});


/*Tables scripts*/
$(document).ready(function() {
    $('#table1').DataTable();
} );
/*Tables scripts end*/
