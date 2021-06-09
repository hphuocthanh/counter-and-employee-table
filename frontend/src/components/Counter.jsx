import React, {useState, useEffect} from 'react'
import "../../node_modules/bootstrap/dist/css/bootstrap.min.css"
import randomcolor from 'randomcolor'

function Counter() {
    const [count, setCount] = useState(0)
    const [color, setColor] = useState("")


    function Increment() {
        setCount(prevCount => prevCount + 1)
    }

    function Reset() {
        setCount(0)
    }

    useEffect(() => {
        setColor(randomcolor())
    }, [count])

    return (
        <div className="container text-center">
            <h2 id="counter-num" style={{color: color}} className="p-2 fs-1">{count}</h2>
            <button id="increment-btn" className="btn btn-outline-success me-1" onClick={Increment}>Increment</button>
            <button id="reset-btn" className="btn btn-outline-secondary" onClick={Reset}>Reset</button>
        </div>
    );
}

export default Counter