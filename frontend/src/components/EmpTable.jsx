import React, { useState, useEffect } from "react"
import axios from "axios"
import Employees from "./Employees"
import Pagination from "./Pagination"

function EmpTable() {
  const [employees, setEmployees] = useState([])
  const [loading, setLoading] = useState(false)
  const [currentPage, setCurrentPage] = useState(1)
  const [employeesPerPage] = useState(5)

  useEffect(() => {
    const fetchEmployees = async () => {
      setLoading(true)
      const res = await axios.get(
        "https://60c130fdb8d3670017556a10.mockapi.io/api/employees"
      )
      setEmployees(res.data)
      setLoading(false)
    };
    fetchEmployees()
  }, [])

  
  // Get current employees
  const indexOfLastEmployee = currentPage * employeesPerPage
  const indexOfFirstEmployee = indexOfLastEmployee - employeesPerPage
  const currentEmployees = employees.slice(indexOfFirstEmployee, indexOfLastEmployee)

  // Change page
  const paginate = (num) => setCurrentPage(num)


  return (
    <div className="container">
      <table className="table table-striped table-hover">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Position</th>
          </tr>
        </thead>
        <Employees employees={currentEmployees} loading={loading} />
      </table>
      <Pagination employeesPerPage={employeesPerPage} totalEmployees={employees.length} paginate={paginate}/>
    </div>
  )
}
export default EmpTable