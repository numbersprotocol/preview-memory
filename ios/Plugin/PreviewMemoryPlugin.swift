import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(PreviewMemoryPlugin)
public class PreviewMemoryPlugin: CAPPlugin {
    private let implementation = PreviewMemory()

    @objc func echo(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": implementation.echo(value)
        ])
    }
    
    @objc func getAvailableMemory(_ call: CAPPluginCall) {
        call.resolve([
            "value": implementation.getAvailableMemory()
        ])
    }
}
