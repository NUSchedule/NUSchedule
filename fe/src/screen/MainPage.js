import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Typography from '@material-ui/core/Typography';
import Container from '@material-ui/core/Container';
import Grid from '@material-ui/core/Grid';
import Paper from '@material-ui/core/Paper';

const useStyles = makeStyles((theme) => ({
    title: {
        flexGrow: 1,
    },
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
    calendarBoxSmall: {
        height: 470,
    },
    outputBox: {
        height: 380,
    },
    outputBoxSmall: {
        height: 200,
    },
    inputBox: {
        height: 750,
    },
    inputBoxSmall : {
        height: 200,
    },
    runButton: {
        height: 100,
    },
    runButtonSmall: {
        height: 60,
    }
}));




export default function MainPage() {
    const classes = useStyles();
    const [width, setWidth] = React.useState(window.innerWidth);
    const breakpoint = 960;

    React.useEffect(() => {
        window.addEventListener("resize", () => setWidth(window.innerWidth));
    }, []);


    return (
        <div>
            <main className={classes.content}>
                <Container maxWidth={false} className={classes.container}>
                    <Grid container spacing={4}>
                        <Grid item xs={12} md={9}>
                            <Grid container spacing = {3} direction="column">
                                {/* Calendar */}
                                <Grid item xs={12}>
                                    <Paper className={width >= breakpoint ? classes.calendarBox : classes.calendarBoxSmall}>
                                        <Typography variant="h3">
                                            {/* Replace with Calendar Component */}
                                            Calendar
                                        </Typography>
                                    </Paper>
                                </Grid>
                                {/* Output */}
                                <Grid item xs={12}>
                                    <Paper className={width >= breakpoint ? classes.outputBox : classes.outputBoxSmall}>
                                        <Typography variant="h3">
                                            {/* Replace with Output Component */}
                                            Output
                                        </Typography>
                                    </Paper>
                                </Grid>
                            </Grid>
                        </Grid>

                        <Grid item xs={12} md={3}>
                            <Grid container spacing = {3} direction="row" justify="center">
                                {/* Input */}
                                <Grid item xs={12}>
                                    <Paper className={width >= breakpoint ? classes.inputBox : classes.inputBoxSmall}>
                                        <Typography variant="h3">
                                            {/* Replace with Input Component */}
                                            Input
                                        </Typography>
                                    </Paper>
                                </Grid>
                                {/* Button */}
                                <Grid item xs={12} md={12} >
                                    <Paper className={width >= breakpoint ? classes.runButton : classes.runButtonSmall}>
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