function validate(date){
    var eighteenYearsAgo = moment().subtract(18, "years");
    var birthday = moment(date);

    if (!birthday.isValid()) {
        return false;    
    }
    else if (eighteenYearsAgo.isAfter(birthday)) {
        return true;    
    }
    else {
        return "sorry, no";    
    }
}
