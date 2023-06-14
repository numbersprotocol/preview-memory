import Foundation

@objc public class PreviewMemory: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
    
    @objc public func getAvailableMemory() -> UInt64 {
        let processInfo = ProcessInfo.processInfo
        let availableMemory = processInfo.physicalMemory
        return availableMemory
    }
}
