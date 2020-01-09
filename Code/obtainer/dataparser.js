const cursos = require("./cursos.json");
const fs= require("fs");



let curos_parsed= cursos.map(obj=>
    {
        let rObj={};
        rObj.nrc=obj.nrc;
        rObj.code=obj.class+obj.course;
        rObj.title=obj.title;
        rObj.maxStudents=obj.maxenrol;
        rObj.currentStudents=obj.enrolled;
        rObj.teachers=obj.instructors
        rObj.schedules=obj.schedules
        return rObj;
    });

fs.writeFile('cursosParsed.json', JSON.stringify(curos_parsed,null,2), function (err) {
    if (err) throw err;
    console.log('Saved!');
});

