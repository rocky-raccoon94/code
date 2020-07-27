

function joinedLogger(level, sep) {
    return function(){
        let res = '';
        const len = arguments.length;
        for (let i = 0; i < len; i++) {
            
            if (arguments[i].level > level) {
                res += arguments[i].text;
                if (i != len - 1) res += sep;
            }
        }                                                                           
        
    
    }
}
const messages = [];
messages.push({ level: 40, text: 'haha' });
messages.push({ level: 60, text: 'hey' });
const mylog = joinedLogger(30, ':');
mylog(...messages);