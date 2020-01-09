
const https = require("https")
const fs = require('fs');

var url= `https://ofertadecursos.uniandes.edu.co/api/courses?term=202010`

https.get(url, (resp) => {
    let data = '';
  
    // A chunk of data has been recieved.
    resp.on('data', (chunk) => {
      data += chunk;
    });
    resp.on('end', () => {
        var cursos= JSON.parse(data)
        let newjson= JSON.stringify(cursos, null, 2);
        fs.writeFile('cursos.json', newjson, (err) => {
            if (err) throw err;
            console.log('Data written to file');
        });
    });

});



