//
//  ContentView.swift
//  ios
//
//  Created by Matsushita Kohei on 2019/12/30.
//  Copyright © 2019 stanfit. All rights reserved.
//

import SwiftUI
import common

struct ContentView: View {
    var body: some View {
        Text(PlatformKt.createPlatformName())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
