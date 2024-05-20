
$('document').ready(function(){

    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        // `/countries/findById/?id=1`

        var href = $(this).attr('href');
        $.get(href, function (state, status) {
            $('#idEdit').val(state.id);
            $('#ddlCountryEdit').val(state.countryid);
            $('#capitalEdit').val(state.capital);
            $('#codeEdit').val(state.code);
            $('#nameEdit').val(state.name);
            $('#detailsEdit').val(state.details);
        });
        $('#editModal').modal(); //show modal
    });

    $('.table #detailsButton').on('click', function (envent) {
        envent.preventDefault();
        var href = $(this).attr('href');

        $.get(href, function (state, status) {
            $('#idDetails').val(state.id);
            $('#ddlCountryDetails').val(state.countryid);
            $('#nameDetails').val(state.name);
            $('#detailsDetails').val(state.details);
            $('#lastModifiedByDetails').val(state.lastModified);
        });

        $('#detailsModal').modal(); //show modal
    });


    $('.table #deleteButton').on('click', function (envent) {
        envent.preventDefault();
        var href = $(this).attr('href');
        $('#deleteModal #delRef').attr('href', href);
        $('#deleteModal').modal(); //show modal
    });
});

/*

 */