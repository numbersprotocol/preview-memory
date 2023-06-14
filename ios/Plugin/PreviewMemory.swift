import Foundation

@objc public class PreviewMemory: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
