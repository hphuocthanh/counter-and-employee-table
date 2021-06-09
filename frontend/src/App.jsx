import "./App.css"
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/js/dist/tab"
import Counter from "./components/Counter"
import EmpTable from "./components/EmpTable"


function App() {
  return (
    <div className="container">
      <h1 className="text-center p-2 bg-light mb-2">
        Counter and Employee Table
      </h1>
      <nav>
        <div className="nav nav-tabs" id="nav-tab" role="tablist">
          <button
            className="nav-link active"
            id="nav-counter-tab"
            data-bs-toggle="tab"
            data-bs-target="#nav-counter"
            type="button"
            role="tab"
            aria-controls="nav-counter"
            aria-selected="true"
          >
            Counter
          </button>
          <button
            className="nav-link"
            id="nav-emp-tab"
            data-bs-toggle="tab"
            data-bs-target="#nav-emp"
            type="button"
            role="tab"
            aria-controls="nav-emp"
            aria-selected="false"
          >
            Employee Table
          </button>
        </div>
      </nav>
      <div className="tab-content" id="nav-tabContent">
        <div
          className="tab-pane fade show active"
          id="nav-counter"
          role="tabpanel"
          aria-labelledby="nav-counter-tab"
        >
            <Counter />
        </div>
        <div
          className="tab-pane fade"
          id="nav-emp"
          role="tabpanel"
          aria-labelledby="nav-emp-tab"
        >
          <EmpTable />
        </div>
      </div>
    </div>
  );
}

export default App
