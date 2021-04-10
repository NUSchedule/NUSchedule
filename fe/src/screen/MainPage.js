import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import CssBaseline from '@material-ui/core/CssBaseline';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import Container from '@material-ui/core/Container';
import Grid from '@material-ui/core/Grid';
import Paper from '@material-ui/core/Paper';

const useStyles = makeStyles((theme) => ({
    title: {
        flexGrow: 1,
    },
    appBarSpacer: theme.mixins.toolbar,
    content: {
        overflow: 'auto',
    },
    container: {
        paddingTop: theme.spacing(4),
        paddingBottom: theme.spacing(4),
    },
    calendarBox: {
        height: 470,
    },
    outputBox: {
        height: 380,
    },
    inputBox: {
        height: 750,
    },
    runButton: {
        height: 100,
    }
}));

export default function MainPage() {
    const classes = useStyles();

    return (
        <div className={classes.root}>
            <CssBaseline />
            <AppBar position="absolute" >
                <Toolbar className={classes.toolbar}>
                    <Typography component="h1" variant="h5" color="inherit" noWrap className={classes.title}>
                        NUSchedule
                    </Typography>
                </Toolbar>
            </AppBar>

            <main className={classes.content}>
                <div className={classes.appBarSpacer} />
                <Container maxWidth="false" className={classes.container}>
                    <Grid container spacing={4}>
                        <Grid item xs={9}>
                            <Grid container spacing = {3}>
                                {/* Calendar */}
                                <Grid item xs={12}>
                                    <Paper className={classes.calendarBox}>
                                        <Typography variant="h3">
                                            {/* Replace with Calendar Component */}
                                            Calendar
                                        </Typography>
                                    </Paper>
                                </Grid>
                                {/* Output */}
                                <Grid item xs={12}>
                                    <Paper className={classes.outputBox}>
                                        <Typography variant="h3">
                                            {/* Replace with Output Component */}
                                            Output
                                        </Typography>
                                    </Paper>
                                </Grid>
                            </Grid>
                        </Grid>

                        <Grid item xs={3}>
                            <Grid container spacing = {3}>
                                {/* Input */}
                                <Grid item xs={12}>
                                    <Paper className={classes.inputBox}>
                                        <Typography variant="h3">
                                            {/* Replace with Input Component */}
                                            Input
                                        </Typography>
                                    </Paper>
                                </Grid>
                                {/* Button */}
                                <Grid item xs={12}>
                                    <Paper className={classes.runButton}>
                                        <Typography variant="h3">
                                            {/* Replace with Button Component */}
                                            Button
                                        </Typography>
                                    </Paper>
                                </Grid>
                            </Grid>
                        </Grid>

                    </Grid>
                </Container>
            </main>
        </div>
    );
}