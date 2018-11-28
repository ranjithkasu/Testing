var request = require('request');
var prompt = require('prompt');
var colors = require('colors/safe');

prompt.message = colors.blue("Maya ");
prompt.delimiter = colors.white(">");
prompt.start();

var routerServer = 'https://shifudev.smartron.com';
var questionX = {
    question: '',
    context: {},
    disambiguation: false,
    disambiguation_context: {},	
    skill_context: [],
    force_skill: false,	
	client: 'shifu',
    target_user: 'vijay.mohan@smartron.com',
    latitude: 12.954353,
    longitude: 80.2434285,
    current_city: 'chennai',
    tz: 19800,
    serial_number: 'THOMEQA15abc50015',
    debug: true
}


function startUserQuestions() {
	prompt.get(['question'], function (err, result) {
		questionX.question  = result.question
		request.post(
			routerServer + '/api',
			{ json: questionX },
			function(error, response, answer) {
				console.log(JSON.stringify(answer,null,4));
				if (error) {
					console.log('********* ERROR **********');					
					console.log(error);
				} else {
						questionX.context = answer.context;
                        questionX.skill_context = answer.skill_context
                        questionX.disambiguation = answer.disambiguation
                        questionX.disambiguation_context = answer.disambiguation_context
					if (answer.status) {
						//console.log(answer);
						// console.log(JSON.stringify(answer,null,4))
                        if (answer.disambiguation) {
                        	console.log('***********DISMABIGUATING***********');
                        	console.log(answer.expressive_answer )
                        }

					} else {
						console.log('***** Could not get a proper result');
					}
				}
				//console.log(answer);
				setTimeout(startUserQuestions,500);
			}
		);
	});
}

startUserQuestions();