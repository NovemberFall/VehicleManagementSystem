
$('document').ready(function(){
    $('table #editButton').on('click',function (event) {
        event.preventDefault();
        // `/countries/findById/?id=1`

        var href = $(this).attr('href');
        $.get(href, function (country, status) {
            $('#idEdit').val(country.id);
            $('#descriptionEdit').val(country.description);
            $('#capitalEdit').val(country.capital);
            $('#codeEdit').val(country.code);
            $('#continentEdit').val(country.continent);
            $('#nationalityEdit').val(country.nationality);
        });
        $('#editModal').modal() //show modal
    });

    $('table #deleteButton').on('click', function (envent) {
        envent.preventDefault();
        var href = $(this).attr('href');

        $('#confirmDeleteButton').attr('href', href);

        $('#deleteModal').modal(); //show modal
    });
});

/*
The modal() function is a method provided by Bootstrap's JavaScript library (Bootstrap is a popular CSS framework).
When called on a selected element, such as $('#editModal'),
it initializes and displays the modal dialog associated with that element.

In summary, $('#editModal').modal() is used to programmatically open and
display the modal dialog identified by the ID "editModal" using jQuery and Bootstrap.


`event.preventDefault()` is called to prevent the default behavior of the element,
which usually includes navigating to a new page or submitting a form. By calling preventDefault(),
the default behavior is suppressed.

Link to my doc:
        https://docs.google.com/document/d/10lyL5W3GwjdtSzVpki3T4DrtQC0fTx0XwG14_aClwsk/edit#bookmark=id.kwcfyp75d8w4
 */