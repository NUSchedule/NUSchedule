import './App.css';
import MainPage from "../../screen/MainPage";
import NUScheduleBar from "./NUScheduleBar";
import SignIn from "../../screen/SignIn";
import Register from "../../screen/Register";
import React, {useState} from "react";
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import axios from "axios";


function App() {
    const [loggedIn, setLoggedIn] = useState(false)

    const onSignIn = (data) => {
        console.log(data)
        setLoggedIn(true)
        axios.post("https://my-json-server.typicode.com/typicode/demo/posts", data)
            .then(response => {
                console.log(response)
            })
            .catch(error => {
                console.log(error)
            })
    }

    const onSignUp = (data) => {
        console.log(data)
        setLoggedIn(true)
        axios.post("https://my-json-server.typicode.com/typicode/demo/posts", data)
            .then(response => {
                console.log(response)
            })
            .catch(error => {
                console.log(error)
            })
    }

    const onSignOut = (data) => {
        setLoggedIn(false)
        console.log("logged out!")
    }



    return (
        <Router>
            <div className="App">
                <NUScheduleBar loggedIn={loggedIn} onLogOut={onSignOut} />
                <div className={"content"}>
                    <Switch>
                        <Route exact path="/">
                            {!loggedIn ? <SignIn onSubmit={onSignIn}/> : <MainPage />}
                        </Route>
                        <Route path="/register">
                            <Register handleSubmit={onSignUp}/>
                        </Route>

                    </Switch>
                </div>
            </div>
        </Router>

  );
}

export default App;
