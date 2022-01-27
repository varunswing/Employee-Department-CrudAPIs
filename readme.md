Employee ID: T2551
Employee Name: Varun Sharma

# Employee/Department Management Based CRUD APIs

This project contains employee informations and perform CRUD APIs

## Operations on Employee

### GET Requests

#### Get all Employees

```markdown
curl http://localhost:8083/api/employee
```

#### Get Employee by thier id

```markdown
curl http://localhost:8083/api/employee/id/{{empId}}
```

#### Get Employees by thier Department

```markdown
curl http://localhost:8083/api/employee/dept/{{deptId}}
```

### PUT Requests

#### Update an Employee

```markdown
curl -X PUT http://localhost:8083/api/employee/<id>?name=<name>&email=<email>&deptId=<deptId>
```

### DELETE Requests

#### Delete an Employee

```markdown
curl -X DELETE http://localhost:8083/api/employee/<id>
```

### POST Requests

#### Add a new Employee

```markdown
curl -X POST -H "Content-Type:application/json" \
 -d '{"name":"Harsh","email":"xyz@gmail.com","dob":"2000-01-01","deptId":1}' \
 http://localhost:8083/api/employee
```

## Operations on Depertmant

### GET Requests

#### Get all Departments

```markdown
curl http://localhost:8083/api/department
```

#### Get Department by id

```markdown
curl http://localhost:8083/api/department/{{deptId}
```

### POST Requests

#### Add a new Department

```markdown
curl -X POST -H "Content-Type:application/json" \
 -d '{"name":"Payments","manager":"qwerty"}' \
 http://localhost:8083/api/department
```

### PUT Requests

#### Update a Department

```markdown
curl -X PUT http://localhost:8083/api/department/<id>?name=<name>&manager=<manager>
```

### DELETE Requests

#### Delete a department

```markdown
curl -X DELETE http://localhost:8083/api/department/<id>
```
