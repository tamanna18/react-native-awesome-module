@objc(TestModule)
class TestModule: NSObject {

    @objc(multiply:withB:withResolver:withRejecter:)
    func multiply(a: Float, b: Float, resolve:RCTPromiseResolveBlock,reject:RCTPromiseRejectBlock) -> Void {
        resolve(a*b)
    }

    @objc(NavigateMe)
    func NavigateMe() -> Void {
        let vc = TestController(nibName: "TestController", bundle: nil)
        vc.present(vc, animated: true)
    }
}
