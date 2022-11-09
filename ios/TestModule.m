#import "TestModule.h"

@implementation TestModule

RCT_EXTERN_METHOD(multiply:(float)a withB:(float)b
                 withResolver:(RCTPromiseResolveBlock)resolve
                 withRejecter:(RCTPromiseRejectBlock)reject)

RCT_EXTERN_METHOD(NavigateMe: (void))

RCT_EXPORT_MODULE();

@end
