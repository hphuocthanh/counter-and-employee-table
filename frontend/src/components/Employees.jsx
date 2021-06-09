import React from "react"

function Employees({ employees, loading }) {
  if (loading) {
    return (
      <tbody>
        <tr>
          <td colSpan="4">No data available</td>
        </tr>
      </tbody>
    )
  }
  return (
    <tbody>
      {employees.map((emp) => (
        <tr key={emp.id}>
          <th scope="row">{emp.id}</th>
          <td>{emp.name}</td>
          <td>{emp.email}</td>
          <td>{emp.position}</td>
        </tr>
      ))}
    </tbody>
  )
}

export default Employees
