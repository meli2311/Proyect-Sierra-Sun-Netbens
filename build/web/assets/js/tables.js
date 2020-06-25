/*Tables scripts*/
$(document).ready(function() {
  $('#table1').DataTable({
    "language": {
      "lengthMenu": "Numero de datos para visualizar _MENU_ ",
      "zeroRecords": "No se encontro elemento",
      "info": "Pagina _PAGE_ de _PAGES_",
      "infoEmpty": "No hay datos disponibles",
      "infoFiltered": "(Se econtraron _TOTAL_ elementos de _MAX_ )",
      "sSearch": "Buscar",
      "oPaginate": {
        "sFirst": "Primero",
        "sLast": "Ultimo",
        "sNext": "Siguiente",
        "sPrevious": "Anterior"
      },
      "sProcessing": "Procesando...."
    }
  });
});


$(document).ready(function() {
  $('#table2').DataTable({
    "language": {
      "lengthMenu": "Numero de datos para visualizar MENU ",
      "zeroRecords": "No se encontro elemento",
      "info": "Pagina PAGE de PAGES",
      "infoEmpty": "No hay datos disponibles",
      "infoFiltered": "(Se econtraron TOTAL elementos de MAX )",
      "sSearch": "Buscar",
      "oPaginate": {
        "sFirst": "Primero",
        "sLast": "Ultimo",
        "sNext": "Siguiente",
        "sPrevious": "Anterior"
      },
      "sProcessing": "Procesando...."
    }
  });
});

/*Tables scripts end*/


/*Scripsts boutons tables validations*/
(function () {
   'use strict';
    window.addEventListener('load', function () {
        // Fetch all the forms we want to apply custom Bootstrap validation styles to
        var forms = document.getElementsByClassName('needs-validation');
        // Loop over them and prevent submission
        var validation = Array.prototype.filter.call(forms, function (form) {
            form.addEventListener('submit', function (event) {
                if (form.checkValidity() === false) {
                    event.preventDefault();
                    event.stopPropagation();
                }
                form.classList.add('was-validated');
            }, false);
        });
    }, false);
})();

/*art.add(new Articulo(rs.getInt("Codigo_A"),rs.getString("Nombre"),rs.getInt("Stock"), rs.getString("Estado"),rs.getInt("Costo_Unidad"),rs.getInt("Stock_maximo")));*/
/*Scripsts boutons tables validations end*/
