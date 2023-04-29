


function f1() {
    let employeeTableBody = document.getElementById('employee-table-body');
    fetch("http://localhost:8080/employees").then(response => {
        response.json().then(data => {
            // console.log(data);
            data.forEach(employee => {
                let row = document.createElement('tr');
                row.innerHTML = `
        <td>${employee.firstName}</td> 
        <td>${employee.lastName}</td>
        <td>${employee.email}</td>
        <td>${employee.position}</td>
        <td><button button style ="background-color:yellow" onclick="updateEmployee('${employee.id}','${employee.firstName}','${employee.lastName}','${employee.email}','${employee.position}')">UPDATE</button> </td>
        <td><button style ="background-color:red" onclick="deleteEmployee(${employee.id})">DELETE</button> </td>
      `;
                employeeTableBody.appendChild(row);
            })
        })

    })
}



function registerEmployee() {

    let EmployeeID = document.getElementById("EmployeeID").value;
    let firstName = document.getElementById("EfirstName").value;
    let lastName = document.getElementById("ElastName").value;
    let email = document.getElementById("Eemail").value;
    let position = document.getElementById("Eposition").value;

    fetch("http://localhost:8080/employees", {

        method: "POST",
        headers: {
            "content-type": "application/json"
        },
        body: JSON.stringify({
            "id": EmployeeID,
            "firstName": firstName,
            "lastName": lastName,
            "email": email,
            "position": position
        })
    }).then(response => {
        response.json().then(data => {
            alert("Emlpoyee sucessfully registered with ID: " + data.id)
        });
    })

}

function deleteEmployee(id) {

    console.log("hello " + id);
    let choice = confirm("Are You Sure Delete Employee?");

    if (choice) {
        fetch(`http://localhost:8080/employees/${id}`, {

            method: "DELETE"

        }).then(response => {
            response.json().then(data => {
                alert("employee sucessfully deleted: ");
                window.location.reload();
                location.reload(true);

            });
        })
    }
}


function updateEmployee(id, firstName, lastName, email, position) {


    let eUpdate = document.getElementById("eUpdate")
    eUpdate.value = "UPDATE";


    let EmployeeID = document.getElementById("EmployeeID")
    let EfirstName = document.getElementById("EfirstName")
    let ElastName = document.getElementById("ElastName")
    let Eemail = document.getElementById("Eemail")
    let Eposition = document.getElementById("Eposition")

    EmployeeID.value = id;
    Eemail.value = email;
    EfirstName.value = firstName;
    ElastName.value = lastName;
    Eposition.value = position;

    console.log();


}
function uEmployee() {
    let EmployeeID = document.getElementById("EmployeeID").value;
    let firstName = document.getElementById("EfirstName").value;
    let lastName = document.getElementById("ElastName").value;
    let email = document.getElementById("Eemail").value;
    let position = document.getElementById("Eposition").value;
    console.log("hello");

    fetch(`http://localhost:8080/employees/${EmployeeID}`, {

        method: "PUT",
        headers: {
            "content-type": "application/json"
        },
        body: JSON.stringify({
            "id": EmployeeID,
            "firstName": firstName,
            "lastName": lastName,
            "email": email,
            "position": position
        })
    }).then(response => {
        response.json().then(data => {
            alert("Emlpoyee UPDATED sucessfully ")
        });
    })
}


function searchByID() {
    let EmployeeID = document.getElementById("searchID").value;
    console.log(EmployeeID)
    let employeeTableBody = document.getElementById('employee-table-body');

    employeeTableBody.innerText = null;

    fetch(`http://localhost:8080/employees/${EmployeeID}`).then(response => {
        response.json().then(employee => {
            console.log(employee);
            let row = document.createElement('tr');
            row.innerHTML = `
        <td>${employee.firstName}</td> 
        <td>${employee.lastName}</td>
        <td>${employee.email}</td>
        <td>${employee.position}</td>
        <td><button button style ="background-color:yellow" onclick="updateEmployee('${employee.id}','${employee.firstName}','${employee.lastName}','${employee.email}','${employee.position}')">UPDATE</button> </td>
        <td><button style ="background-color:red" onclick="deleteEmployee(${employee.id})">DELETE</button> </td>
      `;
            employeeTableBody.appendChild(row);
        })
    })
}