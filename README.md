# 정규 표현식(regular expression, regexp 또는 regex)

 - 특정한 규칙을 가진 문자열의 집합을 표현하는 데 사용하는 형식 언어이다. (*참고: 정규 표현식은 일반적으로 슬래쉬(/)문자로 감싸진 형태로 표현됩니다.)
 
# 메타문자 기능 설명

* .	: 문자	1개의 문자와 일치한다. 단일행 모드에서는 새줄 문자를 제외한다.
* ?	: 바로 앞의 문자가 0 또는 1회 있음을 의미한다. "a?b"는 "b", "ab"를 포함한다.
* \*	: 바로 앞의 문자가 0 또는 0회 이상 있음을 의미한다. "a*b"는 "b", "ab", "aab", "aaab"를 포함한다.
* \+	: 바로 앞의 문자가 1회 이상의 발생을 의미한다. 이를테면 ab+c는 "abc", "abbc", "abbbc" 등을 일치시키지만 "ac"는 일치시키지 않는다. 
* ¦	: 선택	여러 식 중에서 하나를 선택한다. 예를 들어, "abc¦adc"는 abc와 adc 문자열을 모두 포함한다.
* ^	: 처음	문자열이나 행의 처음을 의미한다.
* $	: 끝	문자열이나 행의 끝을 의미한다.
* \ : 메타 문자를 문자열에서 찾고 싶을 때, 메타 문자를 문자 그대로 사용할 수 있도록 변환해주는 기호입니다. \.의 경우, .문자와 일치합니다.
* ( )	: 하위식	여러 식을 하나로 묶을 수 있다. "abc¦adc"와 "a(b¦d)c"는 같은 의미를 가진다.
* \n :	일치하는 n번째 패턴	일치하는 패턴들 중 n번째를 선택하며, 여기에서 n은 1에서 9 중 하나가 올 수 있다.
* [] : 대괄호 사이에 존재하는 문자들 중 하나에 일치합니다.
* [^] : 대괄호 사이의 가장 첫 번째 문자로 ^ 문자가 있을 때, 그 문자 이후에 존재하는 문자들을 제외한 모든 문자와 일치합니다.
* [a-z] : 특정문자1-특정문자2 사이의 모든 문자와 일치합니다. [a-z]의 경우, a 부터 z까지 모든 영문자 소문자와 일치합니다.
* {n} : 앞에 존재하는 문자가 n번 반복되는 문자와 일치합니다.
* {min,max} : 앞에 존재하는 문자가 n번 이상 m번 이하 반복되는 문자와 일치합니다.
* {min,} : 앞에 존재하는 문자가 n번 이상 반복되는 문자와 일치합니다.
* \d : 숫자와 일치합니다.
* \D : 숫자를 제외한 문자와 일치합니다.
* \w : 영문자 및 _ 문자와 일치합니다.
* \W : 영문자 및 _ 문자를 제외한 문자와 일치합니다.
* \s : 여러 가지 공백 문자와 일치합니다. (* 스페이스, 탭, 기타… 공백 문자)
* \S : 공백 문자를 제외한 문자와 일치합니다.
* \b : 단어와 공백 사이의 위치를 찾습니다. 
* \B : \b 를 제외한 전부를 찾습니다.
* \cx : x로 표시된 제어 문자를 찾습니다.
* \f : 용지 공급 문자를 찾습니다.
* \n : 줄 바꿈 문자를 찾습니다. 
* \r : 캐리지 리턴 문자를 찾습니다. 
* \s : 공백, 탭, 용지 공급 등을 비롯한 모든 공백 문자를 찾습니다. 
* \S : 공백이 아닌 문자를 찾습니다. 
* \t : 탭 문자를 찾습니다. 
* \v : 새로 탭 문자를 찾습니다. 
* \xn : n을 찾는데, 여기서 n은 16진수 이스케이프 값입니다. (ASCII 코드가 정규식에 사용될 수 있습니다.)

(?=) : 전방탐색. 
찾고자 하는 표현식 뒤에 전방탐색 표현식을 넣으며(?=와 ) 사이에 표현식을 넣습니다. 
전방탐색 표현식을 통해 문자가 존재하고, 그 앞에 찾고자 하는 문자가 존재할 때 일치합니다. 
특정 문자가 포함된 문자를 찾고 싶지만 결과에 포함하고 싶지는 않을 때 사용합니다.

(?<=) : 후방탐색. 
후방탐색 표현식 (?<=와 ) 사이에 표현식을 넣고, 찾고자 하는 표현식을 작성합니다. 
후방탐색 표현식을 통해 문자가 존재하고, 그 뒤에 찾고자 하는 문자가 존재할 때 일치합니다.

(?!) : 부정형 전방탐색. 
전방탐색과 반대로, 부정형 전방탐색 내의 표현식이 일치하지 않고, 찾고자 하는 문자가 존재할 때 일치합니다.

(?<!) : 부정형 후방탐색. 
후방탐색과 반대로, 부정형 후방탐색 내의 표현식이 일치하지 않고, 찾고자 하는 문자가 존재할 때 일치합니다.

(?(n)) : ?(n)의 n에 그룹의 번호를 넣습니다. 이 뒤에 나타나는 것은 n번 그룹이 존재할 때 일치해야 하는 표현식입니다.

