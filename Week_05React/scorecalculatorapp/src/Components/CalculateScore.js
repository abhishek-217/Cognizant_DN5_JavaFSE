// import './Stylesheets/mystyle.css';
import "../Stylesheets/mystyle.css";

function CalculateScore() {

    const Name = "Abhi";
    const School = "GJPS School";
    const Total = 480;
    const Goal = 500;

    const Average = (Total / Goal) * 100;

    return (
        <div className="box">
            <h1>Student Details</h1>

            <h3>Name : {Name}</h3>

            <h3>School : {School}</h3>

            <h3>Total Marks : {Total}</h3>

            <h3>Goal : {Goal}</h3>

            <h2>Average Score : {Average}%</h2>
        </div>
    );
}

export default CalculateScore;