//
//  ViewController.swift
//  ExistingIOSProject
//
//  Created by kosuke matsumura on 2019/03/23.
//  Copyright © 2019 kosuke matsumura. All rights reserved.
//

import UIKit
import Flutter

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let button = UIButton(type:UIButton.ButtonType.custom)
        button.addTarget(self, action: #selector(handleButtonAction), for: .touchUpInside)
        button.setTitle("Press me", for: UIControl.State.normal)
        button.frame = CGRect(x: 80.0, y: 210.0, width: 160.0, height: 40.0)
        button.backgroundColor = UIColor.blue
        self.view.addSubview(button)
    }

    @objc func handleButtonAction() {
//        let flutterEngine = (UIApplication.shared.delegate as? AppDelegate)?.flutterEngine
//        guard let flutterViewController = FlutterViewController(engine: flutterEngine, nibName: nil, bundle: nil) else {
//            return
//        }
        let flutterViewController = FlutterViewController()
        flutterViewController.setInitialRoute("route_counter")
        self.present(flutterViewController, animated: false, completion: nil)
    }

}

