// Observer(옵저버) //
// Listener(리스너)라고도 함
// 이벤트가 일어나는 것을 감시하는 감시자의 역할

// Event(이벤트) //
// 함수로 직접 요청하지는 않았지만 시스템 또는 루틴에 의해서 발생하게 되는 동작
// (키의 입력, 터치의 발생, 데이터의 수신 등)

// Callback(콜백) //
// 이벤트를 넘겨주는 행위

// Observer Pattern(옵저버 패턴) //
// 이벤트가 발생할 때마다 즉각 처리할 수 있게 만드는 프로그래밍 패턴
// 옵저버 패턴 구현에 2개 클래스(이벤트 발생 및 전달하는 클래스, 이벤트 수신하는 클래스) 필요
// 문제는 후자는 전자를 참조할 수 있지만, 전자는 후자를 참조할 수 없다는 것
// -> 중간다리 역할을 하는 인터페이스(옵저버/리스너) 필요

fun main() {

    EventPrinter().start()

}

// EventPrinter와 Counter 연결
interface EventListener {

    // 이벤트 발생시 숫자 반환하는 추상 함수
   fun onEvent(count: Int)

}

// 특정 숫자 -> 이벤트 발생
class Counter(var listener: EventListener) {

    fun count() {
        // 1~100 범위 내에서 i 1씩 증가
        for(i in 1..100) {
            // i가 5의 배수가 될 때마다 onEvent 호출
            if(i% 5 == 0) listener.onEvent(i)
        }
    }

}

// 이벤트 수신 -> 화면에 출력
class EventPrinter: EventListener {

    // EventListener 상속 -> 구현
    override fun onEvent(count: Int) {
        print("${count}-")
    }

    // Counter의 인스턴스 만듦 -> this로 EventListener 구현부 넘겨줌(객체지향의 다형성)
    fun start() {
        // this -> EventPrinter 객체 자신
        val counter = Counter(this)
        // counter 시작
        counter.count()
    }

}