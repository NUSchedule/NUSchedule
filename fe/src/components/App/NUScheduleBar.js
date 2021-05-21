import AppBar from '@material-ui/core/AppBar';
import Toolbar from "@material-ui/core/Toolbar";
import Typography from "@material-ui/core/Typography";
import React from "react";
import {makeStyles} from "@material-ui/core/styles";
import {IconButton} from "@material-ui/core";


const useStyles = makeStyles((theme) => ({
    title: {
        flexGrow: 1,
    },
    appBarSpacer: theme.mixins.toolbar
}))

export default function NUScheduleBar(props) {
    const classes = useStyles()
    return (
        <div >
            <div className={classes.appBarSpacer} />
            <AppBar position="absolute" >
                {props.loggedIn ?
                    <Toolbar>
                        <Typography component="h1" variant="h5" align='left' color="inherit" noWrap className={classes.title}>
                            NUSchedule
                        </Typography>
                        <IconButton color="inherit" edge="end" size="small" onClick={props.onLogOut}>
                            Log Out
                        </IconButton>
                    </Toolbar> :
                    <Toolbar>
                        <Typography component="h1" variant="h5" align='left' color="inherit" noWrap className={classes.title}>
                            NUSchedule
                        </Typography>
                    </Toolbar>}

            </AppBar>
        </div>
    )

}