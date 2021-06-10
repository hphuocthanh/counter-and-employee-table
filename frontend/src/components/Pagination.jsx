import React from 'react'

function Pagination({ employeesPerPage, totalEmployees, paginate}) {
    const pageNumbers = []

    for (let i = 1; i <= Math.ceil(totalEmployees / employeesPerPage); i++) {
        pageNumbers.push(i);
    }


    return (
        <nav class="mb-5">
            <ul className="pagination">
                {pageNumbers.map(num => (
                    <li key={num} className="page-item">
                        <button className="btn btn-outline-primary" onClick={() => paginate(num)}>
                            {num}
                        </button>
                    </li>
                ))}
            </ul>
        </nav>
    )
}


export default Pagination