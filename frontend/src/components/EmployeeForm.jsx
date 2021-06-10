import React, { useEffect, useState, useRef } from "react";
import "bootstrap/js/dist/modal";

function EmployeeForm({ addNewEmp, isNewEmpAdded }) {
  const [newEmpInfo, setNewEmpInfo] = useState({
    id: "",
    name: "",
    email: "",
    position: "",
  });
  const [showModal, setShowModal] = useState(false);
  const modalRef = useRef();

  function handleChange(event) {
    const { name, value } = event.target;
    setNewEmpInfo((prevEmpInfo) => ({ ...prevEmpInfo, [name]: value }));
  }

  function toggleModal() {
    setShowModal((prevShowModal) => !prevShowModal);
  }

  useEffect(() => {
    modalRef.current.click()
  }, [showModal]);
  
  return (
    <div className="container">
      {/* Button trigger modal */}
      <button
        type="button"
        className="btn btn-primary"
        data-bs-toggle="modal"
        data-bs-target="#addNewEmp"
      >
        Add New Employee
      </button>

      {/* Modal */}
      <div
        className="modal fade"
        id="addNewEmp"
        tabIndex="-1"
        aria-labelledby="addNewEmpLabel"
        aria-hidden="true"
      >
        <div className="modal-dialog">
          <div className="modal-content">
            <div className="modal-header">
              <h5 className="modal-title" id="addNewEmpLabel">
                New Employee Info
              </h5>
              <button
                type="button"
                className="btn-close"
                data-bs-dismiss="modal"
                aria-label="Close"
              ></button>
            </div>
            <div className="modal-body">
              <div class="input-group mb-3">
                <span class="input-group-text">Name</span>
                <input
                  type="text"
                  class="form-control"
                  placeholder="eg. Thanh"
                  aria-label="Name"
                  name="name"
                  value={newEmpInfo.name}
                  onChange={handleChange}
                />
              </div>
              <div class="input-group mb-3">
                <span class="input-group-text">Email</span>
                <input
                  type="email"
                  class="form-control"
                  placeholder="eg. phuocthanhqt113@gmail.com"
                  aria-label="Email"
                  name="email"
                  value={newEmpInfo.email}
                  onChange={handleChange}
                />
              </div>
              <div class="input-group mb-3">
                <span class="input-group-text">Position</span>
                <input
                  type="text"
                  class="form-control"
                  placeholder="eg. Student"
                  aria-label="Position"
                  name="position"
                  value={newEmpInfo.position}
                  onChange={handleChange}
                />
              </div>
            </div>
            <div className="modal-footer">
              <button
                onClick={() => {
                  addNewEmp(newEmpInfo);
                  toggleModal();
                }}
                type="button"
                className="btn btn-success me-2 px-4"
              >
                Add
              </button>
              <button
                ref={modalRef}
                type="button"
                className="btn btn-light"
                data-bs-dismiss="modal"
              >
                Close
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default EmployeeForm;
