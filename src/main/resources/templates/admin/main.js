$(document).ready(function () {

    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {


    $.ajax({
        type: "POST",
        contentType: "application/javascript",
        url: "/api/search",
        cache: false,
        timeout: 600000,
        success: function () {

        },
        error: function (e) {

        }
    });

}