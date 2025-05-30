function enviarDatos() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;
    const operacion = document.getElementById("operacion").value;

    $.ajax({
        url: "http://localhost:8080/calcular",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify({
            numero1: num1,
            numero2: num2,
            operacion: operacion
        }),
        success: function(data) {
            document.getElementById("resultado").textContent = "Resultado: " + data.resultado;
        },
        error: function() {
            document.getElementById("resultado").textContent = "Error al calcular";
        }
    });
}